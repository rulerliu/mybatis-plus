package com.itmayiedu.test;

import cn.hutool.json.JSONUtil;
import com.itmayiedu.entity.User;
import com.itmayiedu.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        User user = new User();
        user.setName("aaaaaa");
        user.setAge(3);
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
//        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
//        user.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        userMapper.insert(user);
        System.out.println("0000");

//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
////        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }

    @Test
    public void test2() {
        Long resourceInstanceMinCreateTimestamp = null;
        while (true) {
            List<User> resourceInstanceList = userMapper.getListByMinCreateTimestamp(resourceInstanceMinCreateTimestamp, 4);
            if (CollectionUtils.isEmpty(resourceInstanceList)) {
                break;
            }
            //标签记录法，记录上次查询过的create_timestamp
            resourceInstanceMinCreateTimestamp = resourceInstanceList.get(resourceInstanceList.size() - 1).getCreateTimestamp();
            System.out.println(JSONUtil.toJsonStr(resourceInstanceList));


        }
    }

}

package com.itmayiedu.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itmayiedu.entity.User;
import com.itmayiedu.mapper.UserMapper;

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

}

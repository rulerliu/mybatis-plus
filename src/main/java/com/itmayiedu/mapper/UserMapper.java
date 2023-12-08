package com.itmayiedu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmayiedu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    Long getMinCreateTimestamp();

    List<User> getListByMinCreateTimestamp(@Param("minCreateTimestamp") Long minCreateTimestamp, @Param("pageSize") Integer pageSize);
}

package com.neuedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

package com.yzy.mapper;

import com.yzy.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * Created by yezhiying on 2017/3/20.
 */
@Mapper
public interface UserMapper {
    @Select("select * from t_user where userName = #{userName}")
    public User findByUsername(@Param("userName") String userName);//根据用户名查找

    @Select("select * from t_user where id = #{id}")
    public User findOne(@Param("id") Long currentId);//根据ID查询
}

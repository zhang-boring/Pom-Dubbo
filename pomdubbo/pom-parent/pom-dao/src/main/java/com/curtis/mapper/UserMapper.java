package com.curtis.mapper;

import com.curtis.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author boring
 */

public interface UserMapper {

    public User findUserByName(@Param("username") String username);
}

package com.mapping;

import com.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by iparhan on 4/16/17.
 */
public interface UserMapperI {
    @Select("select * from userTest")
    public List<User> getAll();
}

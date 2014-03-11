package com.ea.nex.Mappers;

import com.ea.nex.Models.UserDB;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * User: EricQiu
 * Date: 2/27/14
 * Time: 4:03 PM
 */
public interface UserMapper {
    public void save(@Param("entity")UserDB entity);
    public UserDB getUserByName(@Param("name")String name);
    public UserDB getUserByEmail(@Param("email")String email);
    public UserDB getUserByDeviceId(@Param("deviceId")String deviceId);
}

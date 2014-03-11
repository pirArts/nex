package com.ea.nex.Dao;

import com.ea.nex.Models.UserDB;
import com.ea.nex.utils.DBException;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/5/14
 * Time: 2:56 PM
 */
public interface UserDAO {
    public UserDB getUser(String id) throws DBException;
    public void saveUser(UserDB entity) throws DBException;
    public void updateUser(UserDB entity) throws DBException;
}

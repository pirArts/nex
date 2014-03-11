package com.ea.nex.user;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 10:11 PM
 */
public interface UserService {
    public String getUser(String id);
    public void saveUser(String id);
    public void updateUser(String id);
}

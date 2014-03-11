package com.ea.nex.utils;

import com.ea.nex.security.SecurityService;
import com.ea.nex.security.SecurityServiceImpl;
import com.ea.nex.user.UserService;
import com.ea.nex.user.UserServiceImpl;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 10:16 PM
 */
public class ServiceBeanFactory {

    private static UserService userService;
    private static SecurityService securityService;

    //todo: load the server bean for servlet
    static public UserService getUserService(){
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    static public SecurityService getSecurityService(){
        if (securityService == null){
            securityService = new SecurityServiceImpl();
        }
        return securityService;
    }
    // private constructor
    private ServiceBeanFactory(){}
}

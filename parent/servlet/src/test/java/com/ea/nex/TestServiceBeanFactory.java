package com.ea.nex;

import com.ea.nex.security.SecurityService;
import com.ea.nex.security.SecurityServiceImpl;
import com.ea.nex.user.UserService;
import com.ea.nex.user.UserServiceImpl;
import com.ea.nex.utils.ServiceBeanFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 8:38 AM
 */
public class TestServiceBeanFactory {
    
    
    @Test
    public void testGetUserService(){
        UserService userService = ServiceBeanFactory.getUserService();
        Assert.assertEquals(userService.getClass(), UserServiceImpl.class);
        Assert.assertNotNull(userService);
    }

    @Test
    public void testGetSecurityService(){
        SecurityService securityService = ServiceBeanFactory.getSecurityService();
        Assert.assertEquals(securityService.getClass(), SecurityServiceImpl.class);
        Assert.assertNotNull(securityService);
    }
}

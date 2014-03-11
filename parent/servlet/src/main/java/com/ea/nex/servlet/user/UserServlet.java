package com.ea.nex.servlet.user;

import com.ea.nex.user.UserService;
import com.ea.nex.servlet.BaseServlet;
import com.ea.nex.utils.ServiceBeanFactory;

import javax.servlet.ServletException;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 9:48 PM
 */
public abstract class UserServlet extends BaseServlet {

    protected UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        userService = ServiceBeanFactory.getUserService();
    }

}

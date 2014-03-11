package com.ea.nex.servlet;

import com.ea.nex.security.SecurityService;
import com.ea.nex.utils.ServiceBeanFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/5/14
 * Time: 2:42 PM
 */
public class BaseServlet extends HttpServlet {
    // service
    protected static SecurityService securityService;

    // constant
    private static String REQUEST_ID = "Request-Id";

    @Override
    public void init() throws ServletException {
        super.init();
        securityService = ServiceBeanFactory.getSecurityService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException,IOException {
        throw new ServletException("Error call for Get: "+ this.getClass().getName());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        throw new ServletException("Error call for Get: "+ this.getClass().getName());
    }

    protected boolean checkHeader(HttpServletRequest request){
        return request.getHeader(REQUEST_ID) != null;
    }

    protected boolean checkParameters(HttpServletRequest request){
        Enumeration params = request.getParameterNames();
        Map<String, String> map = new HashMap<String, String>();
        while (params.hasMoreElements()){
            String param = params.nextElement().toString();
            map.put(param.toString(), request.getParameter(param.toString()));
        }
        return securityService.checkParamters(map);
    }
}

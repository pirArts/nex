package com.ea.nex.mock;

import com.ea.nex.servlet.user.GetUserServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 8:43 AM
 */
public class MockGetUserServlet extends GetUserServlet {
    public void get(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}

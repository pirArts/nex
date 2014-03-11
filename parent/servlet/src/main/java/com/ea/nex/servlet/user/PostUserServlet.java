package com.ea.nex.servlet.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 10:06 PM
 */
public class PostUserServlet extends UserServlet {
    private static Log log = LogFactory.getLog(PostUserServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //* successful connection
        log.info("Received request:" + req.getRequestURI());
        resp.setStatus(200);

        //* check the required header
        if (!checkHeader(req)) {
            log.error("Missing required header");
            return;
        }

        //* post user data
        return;
    }


}

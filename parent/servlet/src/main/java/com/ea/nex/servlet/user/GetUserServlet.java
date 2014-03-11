package com.ea.nex.servlet.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 9:58 PM
 */

public class GetUserServlet extends UserServlet {
    private static Log log = LogFactory.getLog(GetUserServlet.class);
    private static String DEVICE_ID = "id";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException,IOException {

        //* successful connection
        log.info("Received request:" + req.getRequestURI()+ "?"+req.getQueryString());
        resp.setStatus(200);

        //* check the required header
        if (!checkHeader(req)) {
            log.error("Missing required header.");
            writeUserInfo(resp, "{Error:505}");
            return;
        }

        // check the parameter
        if (!checkParameters(req)) {
            log.error("Error request parameter.");
            writeUserInfo(resp, "{Error:506}");
            return;
        }

        //* get the user info and return
        String userInfo = userService.getUser(getDeviceId(req));
        writeUserInfo(resp, userInfo);
    }



    private String getDeviceId(HttpServletRequest request){
       return request.getParameter(DEVICE_ID);
    }

    private void writeUserInfo(HttpServletResponse response, String info) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(info);
    }
}

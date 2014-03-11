package com.ea.nex;

import com.ea.nex.mock.MockGetUserServlet;
import com.ea.nex.mock.MockHttpServeltResponse;
import com.ea.nex.mock.MockHttpServletRequest;
import junit.framework.Assert;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.easymock.EasyMock;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 8:36 AM
 */
public class TestGetUserServlet {
    private static Log log = LogFactory.getLog(TestGetUserServlet.class);

    // member
    MockGetUserServlet getUserServlet;
    MockHttpServletRequest request;
    MockHttpServeltResponse response;
    PrintWriter printWriter;

    @BeforeClass
    public void init(){
        if (getUserServlet == null){
            getUserServlet = new MockGetUserServlet();
        }
        if (request == null){
            request = new MockHttpServletRequest();
        }
        if (response == null){
            response = new MockHttpServeltResponse();
            printWriter = EasyMock.createMock(PrintWriter.class);
            response.setPrintWriter(printWriter);
        }
    }

    @BeforeMethod
    public void setUp(){
        reset();
    }

    public void replay(){
        EasyMock.replay(printWriter);
    }

    public void reset(){
        EasyMock.reset(printWriter);
    }

    @Test
    public void testGet(){

        // test
        try {
            getUserServlet.get(request, response);
            Assert.assertNotNull(response.getStatus());
        } catch (ServletException e) {
            log.error(e.getMessage());
            Assert.fail();
        } catch (IOException e) {
            log.error(e.getMessage());
            Assert.fail();
        }
    }
}

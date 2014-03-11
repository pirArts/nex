package com.ea.nex;

import com.ea.nex.security.SecurityService;
import com.ea.nex.security.SecurityServiceImpl;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 12:17 PM
 */
public class TestSecurityService {

    private SecurityService securityService;

    @BeforeClass
    public void init(){
        if (securityService == null){
            securityService = new SecurityServiceImpl();
        }
    }

    @Test
    public void testChechParameter(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "c4ca4238a0b923820dcc509a6f75849b");
        map.put("id", "1");
        boolean res = securityService.checkParamters(map);
        Assert.assertTrue(res);
    }
}

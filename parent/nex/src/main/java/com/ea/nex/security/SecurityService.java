package com.ea.nex.security;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 12:05 AM
 */
public interface SecurityService {
    public boolean checkParamters(Map<String, String> map);
}

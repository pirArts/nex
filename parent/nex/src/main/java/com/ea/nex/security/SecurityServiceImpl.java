package com.ea.nex.security;

import com.ea.nex.utils.SecurityUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 12:06 AM
 */
public class SecurityServiceImpl implements SecurityService {

    private static String KEY = "key";

    public boolean checkParamters(Map<String, String> map) {
        if (map.get(KEY) == null){
            return false;
        };
        ArrayList<String> keyList = new ArrayList<String>(map.keySet());
        ArrayList<String> valueList = new ArrayList<String>();

        // remove key
        keyList.remove(KEY);
        Collections.sort(keyList);

        for(String key : keyList){
            valueList.add(map.get(key));
        }

        return map.get(KEY).equals(SecurityUtil.encryptRequestParameters(valueList));
    }
}

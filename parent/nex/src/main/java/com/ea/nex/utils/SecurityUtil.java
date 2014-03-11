package com.ea.nex.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 11:42 AM
 */
public class SecurityUtil {
    public static Log log = LogFactory.getLog(SecurityUtil.class);

    private final static String[] hexDigits = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f" };

    public static String encryptRequestParameters(List<String> attributes) {
        if(attributes == null || attributes.size() < 1){
            return "";
        }
        // parameter concatenation
        StringBuilder chain = new StringBuilder();
        for (String s : attributes){
            chain.append(s);
        }

        try{
            // generator md5 code
            return md5Encode(chain.toString());
        } catch (NexException e){
            log.error("Error when encrypting : " + e.getMessage());
        }
        return "";
    }

    public static String md5Encode(String string) throws NexException{
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return byteArrayToHexString(messageDigest.digest(string.getBytes()));
        }catch (NoSuchAlgorithmException e){
            throw new NexException("NoSuchAlgorithmException : " + e.getCause()+ " - " + e.getMessage());
        } catch (Exception e){
            throw new NexException("Encode exception : " + e.getCause()+ " - " + e.getMessage());
        }
    }

    private static String byteArrayToHexString(byte[] string){
        StringBuffer result = new StringBuffer();
        for (int i=0; i<string.length; i++){
            result.append(byteToHexString(string[i]));
        }
        return result.toString();
    }

    private static String byteToHexString(byte b){
        int n = b;
        if(n < 0) n += 256;
        int d1 = n/16;
        int d2 = n%16;
        return hexDigits[d1] + hexDigits[d2];
    }
}

package com.ea.nex.mock;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/7/14
 * Time: 8:50 AM
 */
public class MockHttpServeltResponse implements HttpServletResponse {

    private int status;
    private PrintWriter printWriter;

    public void addCookie(Cookie cookie) {
    }

    public boolean containsHeader(String s) {
        return false;
    }

    public String encodeURL(String s) {
        return null;
    }

    public String encodeRedirectURL(String s) {
        return null;
    }

    public String encodeUrl(String s) {
        return null;
    }

    public String encodeRedirectUrl(String s) {
        return null;
    }

    public void sendError(int i, String s) throws IOException {
    }

    public void sendError(int i) throws IOException {
    }

    public void sendRedirect(String s) throws IOException {
    }

    public void setDateHeader(String s, long l) {
    }

    public void addDateHeader(String s, long l) {
    }

    public void setHeader(String s, String s2) {
    }

    public void addHeader(String s, String s2) {
    }

    public void setIntHeader(String s, int i) {
    }

    public void addIntHeader(String s, int i) {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int i) {
        status = i;
    }

    public void setStatus(int i, String s) {
    }

    public String getCharacterEncoding() {
        return null;
    }

    public String getContentType() {
        return null;
    }

    public ServletOutputStream getOutputStream() throws IOException {
        return null;
    }

    public void setPrintWriter(PrintWriter p){
        this.printWriter = p;
    }

    public PrintWriter getWriter() throws IOException {
        return printWriter;
    }

    public void setCharacterEncoding(String s) {
    }

    public void setContentLength(int i) {
    }

    public void setContentType(String s) {
    }

    public void setBufferSize(int i) {
    }

    public int getBufferSize() {
        return 0;
    }

    public void flushBuffer() throws IOException {
    }

    public void resetBuffer() {
    }

    public boolean isCommitted() {
        return false;
    }

    public void reset() {
    }

    public void setLocale(Locale locale) {
    }

    public Locale getLocale() {
        return null;
    }
}

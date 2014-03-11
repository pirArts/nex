package com.ea.nex.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * UserDB: EricQiu
 * Date: 2/27/14
 * Time: 3:56 PM
 */

public class UserDB implements Serializable{

    private static final long serialVersionUID = 4872640461000241018L;

    private Long id;
    private String deviceId;
    private String email;
    private String name;
    private String password;

    private Date dateCreated;
    private Date dateModified;

    public UserDB(){

    }

    public UserDB(String id){
        this.deviceId = id;
        this.name = "unKnown";
        this.email= "unKnown";
        this.password = "default";
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("{\nUser:{");
        stringBuilder.append("\n\tname:" + name);
        stringBuilder.append(",\n\temail:" + email);
        stringBuilder.append(",\n\tdeviceId:" + deviceId);
        stringBuilder.append("\n}\n}");

        return stringBuilder.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}

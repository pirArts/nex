package com.ea.nex.user;

import com.ea.nex.Dao.UserDAO;
import com.ea.nex.Dao.UserDAOImpl;
import com.ea.nex.Models.UserDB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 2/27/14
 * Time: 10:11 PM
 */
public class UserServiceImpl implements UserService {
    private static Log log = LogFactory.getLog(UserServiceImpl.class);
    private UserDAO userDAO = new UserDAOImpl();

    public String getUser(String id) {
        log.info("Get User by id : " + id);
        try{
            UserDB userDB = userDAO.getUser(id);
            if (userDB == null){
                log.info(String.format("No User found with id : %s; And Create one;", id));
                userDB = new UserDB(id);
                userDAO.saveUser(userDB);
            }
            return userDB.toString();
        } catch (Exception e){
            log.error("Exception : " + e.getMessage());
        }

        // exception happens
        return "";
    }

    public void saveUser(String id) {
        try{
            UserDB userDB = new UserDB(id);
            userDAO.saveUser(userDB);
        } catch (Exception e){
            log.error("Exception : " + e.getMessage());
        }
    }

    public void updateUser(String id) {
    }


    /*
    *
    *  For Account
    *
    *  update or save
    *
    * */
    public void updateOrSave(String id){

    }
}

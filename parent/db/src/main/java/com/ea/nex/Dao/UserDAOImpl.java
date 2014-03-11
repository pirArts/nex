package com.ea.nex.Dao;

import com.ea.nex.Mappers.UserMapper;
import com.ea.nex.Models.UserDB;
import com.ea.nex.utils.DBException;
import com.ea.nex.utils.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/5/14
 * Time: 2:59 PM
 */
public class UserDAOImpl implements UserDAO {

    SqlSessionFactory factory = MyBatisSessionFactory.getSqlSessionFactory();

    public UserDB getUser(String id) throws DBException {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserDB userDB = null;
        try{
            userDB = mapper.getUserByDeviceId(id);
        } catch (Exception e){
            throw new DBException(e.getMessage());
        } finally {
            sqlSession.close();
        }
        return userDB;
    }

    public void saveUser(UserDB entity) throws DBException {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        try{
            mapper.save(entity);
            sqlSession.commit();
        } catch (Exception e){
            throw new DBException(e.getMessage());
        } finally {
            sqlSession.close();
        }
    }

    public void updateUser(UserDB entity) {
    }
}

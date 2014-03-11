package com.ea.nex.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: ericqiu
 * Date: 3/5/14
 * Time: 9:40 PM
 */
public class MyBatisSessionFactory {
    private static Log log = LogFactory.getLog(MyBatisSessionFactory.class);
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory(){
        if (sqlSessionFactory != null)
        {
            return sqlSessionFactory;
        } else {
            String resource = "ibatis/sqlMapConfig.xml";
            try{
                Reader reader = Resources.getResourceAsReader(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                reader.close();
            }catch (IOException e){
                log.error("IBatis Resources missing:" + e.getMessage());
            }
            return sqlSessionFactory;
        }
    }

    //private constructor
    private MyBatisSessionFactory(){}
}

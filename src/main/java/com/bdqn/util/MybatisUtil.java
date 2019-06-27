package com.bdqn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory SqlSessionFactory = null;
    static {
        try{
            SqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession createSqlSession(){
        return SqlSessionFactory.openSession();
    }
    public static void closeSqlSession(SqlSession SqlSession){
        if (SqlSession != null){
            SqlSession.close();
        }
    }
    /*public static SqlSession openSqlsession(){
            String resources = "mybatis-config,xml";
            SqlSession session = null;
            try {
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resources));
                session = sqlSessionFactory.openSession();
            }catch (Exception e) {
                e.printStackTrace();
            }
        return session;
    }
    public static void closeSession(SqlSession session){
        if(session!=null){
            session.close();
        }
    }*/
}

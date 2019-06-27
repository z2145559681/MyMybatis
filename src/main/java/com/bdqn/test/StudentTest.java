package com.bdqn.test;
import com.bdqn.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        String resources = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resources);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Student> list = sqlSession.selectList("com.bdqn.entity.Student.getListStudent");
            for (Student student:list
                 ) {
                System.out.println("姓名:"+student.getStu_name()+"，年龄:"+student.getStu_age()+"，地址:"+student.getStu_address());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

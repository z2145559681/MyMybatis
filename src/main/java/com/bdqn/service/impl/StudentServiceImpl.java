package com.bdqn.service.impl;
import com.bdqn.dao.StudentDao;
import com.bdqn.entity.Student;
import com.bdqn.service.StudentService;
import com.bdqn.util.MybatisUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getListStudent() {
        List<Student> list = MybatisUtil.createSqlSession().getMapper(StudentDao.class).getListStudent();
        return list;
    }
}

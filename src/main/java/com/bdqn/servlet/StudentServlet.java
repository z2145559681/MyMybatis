package com.bdqn.servlet;

import com.bdqn.entity.Student;
import com.bdqn.service.StudentService;
import com.bdqn.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    StudentService studentService = new StudentServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = studentService.getListStudent();
        System.out.println(list.size());
        req.setAttribute("list",list);
        req.getRequestDispatcher("show.jsp").forward(req,resp);
    }
}

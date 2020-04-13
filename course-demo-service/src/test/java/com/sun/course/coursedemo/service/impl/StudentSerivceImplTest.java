package com.sun.course.coursedemo.service.impl;


import com.sun.course.coursedemo.model.Student;
import com.sun.course.coursedemo.service.StudentSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@SpringBootTest(classes = CourseDemoApp.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentSerivceImplTest {

    @Autowired
    private StudentSerivce studentSerivce;

    @Test
    public void getStudentByName(){
        String name = "Tom";
        Student student = studentSerivce.getStudentByName(name);
        System.out.println(student);
    }
}
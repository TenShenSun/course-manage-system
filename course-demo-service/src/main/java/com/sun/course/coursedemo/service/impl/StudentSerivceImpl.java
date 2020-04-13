package com.sun.course.coursedemo.service.impl;

import com.sun.course.coursedemo.mapper.StudentMapper;
import com.sun.course.coursedemo.model.Student;
import com.sun.course.coursedemo.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSerivceImpl implements StudentSerivce {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }
}

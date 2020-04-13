package com.sun.course.coursedemo.controller;

import com.sun.course.coursedemo.mapper.StudentMapper;
import com.sun.course.coursedemo.model.Student;
import com.sun.course.coursedemo.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.constraints.NotNull;

@Controller
public class StudentController {

    @Autowired
    private StudentSerivce studentSerivce;

    @ResponseBody
    @RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable @NotNull String name){
        return studentSerivce.getStudentByName(name);
    }

}

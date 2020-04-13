package com.sun.course.coursedemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Student {

    private Integer id;
    private String stuName;
    private Boolean stuGender;
    private Integer stuAge;
    private Date stuEntranceDate;
    private Date stuGraduateDate;
    private Boolean stuStatus;
    private Boolean yn;
}

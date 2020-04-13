package com.sun.course.coursedemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.course.coursedemo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {


    @Select("select * from student where stu_name = #{name}")
    public Student getStudentByName(@Param("name") String name);
}

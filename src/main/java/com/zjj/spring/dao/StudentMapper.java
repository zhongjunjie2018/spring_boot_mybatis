package com.zjj.spring.dao;

import com.zjj.spring.model.Student;
import com.zjj.spring.model.User;
import com.zjj.spring.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {

    void insertStudent(Student student);

    void deleteStudent(String name);
}
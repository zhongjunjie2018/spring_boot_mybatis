package com.zjj.spring.service;

import com.zjj.spring.model.Student;

public interface StudentService {

    void addStudent(Student student);

    void removeStudent(String name);
}

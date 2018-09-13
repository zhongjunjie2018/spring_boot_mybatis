package com.zjj.spring.serviceImpl;

import com.zjj.spring.dao.StudentMapper;
import com.zjj.spring.model.Student;
import com.zjj.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
       studentMapper.insertStudent(student);
    }

    @Override
    public void removeStudent(String name) {
        studentMapper.deleteStudent(name);
    }
}

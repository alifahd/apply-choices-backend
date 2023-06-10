package com.applychoices.applychoicesbackend.service;

import com.applychoices.applychoicesbackend.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

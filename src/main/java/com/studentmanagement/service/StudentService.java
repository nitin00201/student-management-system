package com.studentmanagement.service;
import com.studentmanagement.entity.Student;

import java.util.*;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}

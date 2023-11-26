package com.studentmanagement.service.impl;

import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentrepository;

    public StudentServiceImpl(StudentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentrepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentrepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentrepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
         studentrepository.deleteById(id);
    }


}

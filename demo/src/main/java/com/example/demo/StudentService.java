package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao){
        this.studentDao= studentDao;
    }

    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Student> getStudentById(Long id) {
        return studentDao.findById(id);
    }

    @Transactional
    public Student createStudent(Student student) {
        studentDao.save(student);
        return student;
    }

    @Transactional
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sinh viên với id: " + id));

        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setEmail(studentDetails.getEmail());

        studentDao.update(student);
        return student;
    }

    @Transactional
    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }
}

package org.ysh.studentmanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ysh.studentmanage.entity.Student;
import org.ysh.studentmanage.repository.StudentRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // 获取学生列表
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // 保存学生信息
    @Transactional(readOnly = false)
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id is not exist" + id));
    }

    @Transactional(readOnly = false)
    public void deleteById(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("id is not exist" + id);
        }
        studentRepository.deleteById(id);
    }
}

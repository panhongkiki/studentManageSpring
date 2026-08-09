package org.ysh.studentmanage.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.ysh.studentmanage.entity.Student;
import org.ysh.studentmanage.repository.StudentRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final StudentRepository studentRepository;

    @Autowired
    public DataInitializer(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @PostConstruct
    public void init(){
        if (studentRepository.count() == 0) {
            studentRepository.save(new Student("张三", 20, "zhangsan@example.com"));
            studentRepository.save(new Student("李四", 22, "lisi@example.com"));
            studentRepository.save(new Student("王五", 21, "wangwu@example.com"));
        }
    }
}

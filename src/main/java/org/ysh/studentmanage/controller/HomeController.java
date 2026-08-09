package org.ysh.studentmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.ysh.studentmanage.service.StudentService;

@Controller
public class HomeController {
    private final StudentService studentService;

    @Autowired
    public HomeController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.findAll());
        return "student-list";
    }
}

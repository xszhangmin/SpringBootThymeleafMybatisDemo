package com.zhangmin.demo.web;

import com.zhangmin.demo.entity.Student;
import com.zhangmin.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "student/list";
    }
}

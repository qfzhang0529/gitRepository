package com.hr.springboot2.controller;

import com.hr.springboot2.entity.StudentInfo;
import com.hr.springboot2.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentInfoService studentInfoService;

    @RequestMapping("/find")
    public ModelAndView find(){
        //查询所有学生
        List<StudentInfo> stuList = studentInfoService.findStu();

        ModelAndView mv = new ModelAndView("stu/list");
        mv.addObject("stuList",stuList);

        return mv;
    }
}

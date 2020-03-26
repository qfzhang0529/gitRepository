package com.hr.springboot2.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hr.springboot2.entity.StudentInfo;

import java.util.List;

public interface StudentInfoService extends IService<StudentInfo> {
    public List<StudentInfo> findStu();
}

package com.hr.springboot2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hr.springboot2.dao.StudentInfoMapper;
import com.hr.springboot2.entity.StudentInfo;
import com.hr.springboot2.service.StudentInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements StudentInfoService {
    public List<StudentInfo> findStu(){
        return this.getBaseMapper().findStu();
    }
}

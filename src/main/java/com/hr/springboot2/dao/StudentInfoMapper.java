package com.hr.springboot2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot2.entity.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentInfoMapper extends BaseMapper<StudentInfo> {
    public List<StudentInfo> findStu();
}

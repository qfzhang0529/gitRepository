package com.hr.springboot2.dao;

import com.hr.springboot2.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentInfoJpa extends JpaRepository<StudentInfo,Integer> {
    //自定义其它方法
    //HQL语句
    //@Query("from StudentInfo s where s.name=?1")
    @Query("from StudentInfo s where s.name=:name")
    public StudentInfo findByName(@Param("name") String name);

    //sql语句
    @Query(value = "select * from Student_Info s where s.name=:name",nativeQuery = true)
    public StudentInfo findBySql();
}

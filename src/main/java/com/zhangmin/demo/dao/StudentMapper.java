package com.zhangmin.demo.dao;

import com.zhangmin.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    Student findById(Integer id);

    List<Student> findAll();
}

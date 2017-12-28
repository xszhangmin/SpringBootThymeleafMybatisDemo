package com.zhangmin.demo.service;

import com.zhangmin.demo.entity.Student;

import java.util.List;

/**
 * Created by zhangmin on 17/12/28.
 */
public interface StudentService {

    Student findById(Integer id);

    List<Student> findAll();
}

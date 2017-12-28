package com.zhangmin.demo.service.impl;

import com.zhangmin.demo.dao.StudentMapper;
import com.zhangmin.demo.entity.Student;
import com.zhangmin.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 17/12/28.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student findById(Integer id){
        return studentMapper.findById(id);
    }

    public List<Student> findAll(){
        return studentMapper.findAll();
    }
}

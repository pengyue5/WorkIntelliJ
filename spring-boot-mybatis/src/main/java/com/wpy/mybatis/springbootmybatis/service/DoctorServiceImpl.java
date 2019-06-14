package com.wpy.mybatis.springbootmybatis.service;

import com.wpy.mybatis.springbootmybatis.mapper.DoctorMapper;
import com.wpy.mybatis.springbootmybatis.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl {

    @Autowired
    private DoctorMapper doctorMapper;

    public List<Doctor> getAllDoctors(Long id) {
        return doctorMapper.getAllDoctors(id);
    }
}

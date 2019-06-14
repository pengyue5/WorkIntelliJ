package com.wpy.mybatis.springbootmybatis.DoctorController;

import com.wpy.mybatis.springbootmybatis.mapper.DoctorMapper;
import com.wpy.mybatis.springbootmybatis.model.Doctor;
import com.wpy.mybatis.springbootmybatis.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorServiceImpl doctorServiceImpl;

    @GetMapping("/{id}")
    public List<Doctor> getAllDoctors(@PathVariable Long id) {
        return doctorServiceImpl.getAllDoctors(id);
    }
}

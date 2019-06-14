package com.wpy.mybatis.springbootmybatis.mapper;

import com.wpy.mybatis.springbootmybatis.model.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface DoctorMapper {
    List<Doctor> getAllDoctors(Long id);
}

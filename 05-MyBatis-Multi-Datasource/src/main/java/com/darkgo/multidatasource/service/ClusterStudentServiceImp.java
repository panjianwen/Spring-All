package com.darkgo.multidatasource.service;

import com.darkgo.multidatasource.mapper.ClusterStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentServiceImp
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@Service("ClusterStudentService")
public class ClusterStudentServiceImp implements ClusterStudentService{

    @Autowired
    ClusterStudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> queryAllStudents() {
        return studentMapper.getAllStudents();
    }
}

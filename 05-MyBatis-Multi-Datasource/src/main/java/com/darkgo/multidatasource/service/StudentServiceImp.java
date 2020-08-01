package com.darkgo.multidatasource.service;

import com.darkgo.multidatasource.masterdao.MasterStudentMapper;
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
@Service("StudentService")
public class StudentServiceImp  implements StudentService{

    @Autowired
    MasterStudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> queryAllStudents() {
        return studentMapper.getAllStudents();
    }
}

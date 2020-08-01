package com.darkgo.jdbcmultidatasource.service;

import com.darkgo.jdbcmultidatasource.dao.ClusterStudentDao;
import com.darkgo.jdbcmultidatasource.dao.MasterStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentServiceImp
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@Service("studentService")
public class StudentServiceImp implements StudentService {
    @Autowired
    MasterStudentDao masterStudentDao;

    @Autowired
    ClusterStudentDao clusterStudentDao;

    @Override
    public List<Map<String, Object>> getAllStudentsFromMaster() {
        return masterStudentDao.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsFromCluster() {
        return clusterStudentDao.getAllStudents();
    }
}

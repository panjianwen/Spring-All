package com.darkgo.jdbctemplate.service;

import com.darkgo.jdbctemplate.Student;
import com.darkgo.jdbctemplate.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImp
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int deleteById(int id) {
        return studentDao.deleteById(id);
    }

    @Override
    public Student queryStudentById(int id) {
        return studentDao.queryStudentById(id);
    }
}

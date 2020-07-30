package com.darkgo.mybatis.service;

import com.darkgo.mybatis.Student;
import com.darkgo.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteBysno(int id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public Student queryStudentBySno(int id) {
        return studentMapper.queryStudentById(id);
    }
}

package com.darkgo.jdbctemplate.dao;

import com.darkgo.jdbctemplate.Student;
import com.darkgo.jdbctemplate.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

/**
 * @ClassName StudentDaoImp
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int add(Student student) {
        String sql = "insert into student(`name`,gender) values(?,?) ";
        return jdbcTemplate.update(sql,student.getName(),student.getGender());
    }

    @Override
    public int update(Student student) {
        String sql = "update student set `name`= ? ,gender = ?";
        return jdbcTemplate.update(sql,student.getName(),student.getGender());
    }

    @Override
    public int deleteById(int id) {
        String sql = "delete from student where id =?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public Student queryStudentById(int id) {
        String sql = "select * from student where id = ?";
        Object[] args = {id};
        int[] argTypes = { Types.VARCHAR };
        List<Student> studentList = this.jdbcTemplate.query(sql, args, argTypes, new StudentMapper());
        if (studentList.size() > 0) {
            return studentList.get(0);
        } else {
            return null;
        }
    }
}

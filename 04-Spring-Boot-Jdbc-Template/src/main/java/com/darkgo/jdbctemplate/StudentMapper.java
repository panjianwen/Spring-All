package com.darkgo.jdbctemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName StudentMapper
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
public class StudentMapper  implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setGender(resultSet.getString("gender"));
        return student;
    }
}

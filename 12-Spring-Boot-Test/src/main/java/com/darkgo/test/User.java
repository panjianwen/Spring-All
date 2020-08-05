package com.darkgo.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description: TODO
 * @Author pan
 * @Date 2020/8/4
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String name;
    private String gender;
    private Integer age;
}
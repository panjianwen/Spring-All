package com.darkgo.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Account
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String name;
    private String account;
    private String password;
    private String phone;

}

package com.darkgo.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description: TODO
 * @Author pan
 * @Date 2020/8/3
 * @Version V1.0
 **/
@Data
public class User  implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;
    private String userName;
    private int age;
//    @JsonIgnore
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
}

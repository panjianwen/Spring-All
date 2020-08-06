package com.darkgo.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("用户")
public class User {
    @ApiModelProperty("用户ID")
    private Long id;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户性别")
    private String gender;
    @ApiModelProperty("年龄")
    private Integer age;
}
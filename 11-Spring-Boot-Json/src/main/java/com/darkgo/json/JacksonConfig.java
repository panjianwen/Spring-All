package com.darkgo.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @ClassName JacksonConfig
 * @Description: TODO
 * @Author pan
 * @Date 2020/8/3
 * @Version V1.0
 **/
//@Configuration
public class JacksonConfig {
//    @Bean
    public ObjectMapper getObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return mapper;
    }
}

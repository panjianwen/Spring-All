package com.darkgo.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author pan
 * @Date 2020/8/3
 * @Version V1.0
 **/
@RestController
public class UserController {

    @RequestMapping("/")
    public User index(){
        User user = new User();
        user.setAge(11);
        user.setUserName("kangkang");
        user.setPassword("pass");
        user.setBirthday(new Date());
        return user;
    }

    @Autowired
    ObjectMapper mapper;

    @RequestMapping("/s")
    @ResponseBody
    public String serialization() {
        try {
            User user = new User();
            user.setUserName("eric");
            user.setBirthday(new Date());
            String str = mapper.writeValueAsString(user);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/readJsonString")
    @ResponseBody
    public String readJsonString() {
        try {
            String json = "{\"name\":\"eric\",\"age\":26}";
            JsonNode node = this.mapper.readTree(json);
            String name = node.get("name").asText();
            int age = node.get("age").asInt();
            return name + " " + age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/rObject")
    public String readJsonObject() {
        try {
            String json = "{\"userName\":\"eric\",\"age\":26}";
            User user = mapper.readValue(json, User.class);
//            JsonNode node = this.mapper.readTree(json);
//            String name = node.get("name").asText();
//            int age = node.get("age").asInt();
            return user.getAge() + " " + user.getUserName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("customize")
    @ResponseBody
    public String customize() throws JsonParseException, JsonMappingException, IOException {
        String jsonStr = "[{\"userName\":\"mrbird\",\"age\":26},{\"userName\":\"scott\",\"age\":27}]";
        JavaType type = mapper.getTypeFactory().constructParametricType(List.class, User.class);
        List<User> list = mapper.readValue(jsonStr, type);
        StringBuilder msg = new StringBuilder();
        for (User user : list) {
            msg.append(user.getUserName());
        }
        return msg.toString();
    }
}

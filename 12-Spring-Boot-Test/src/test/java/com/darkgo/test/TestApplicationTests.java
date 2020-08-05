package com.darkgo.test;

import lombok.ToString;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }

    @BeforeTestMethod
    public void beforeTest() {
        System.out.println("before Test");
        Assert.assertEquals(2,1+1);
    }

    @AfterTestMethod
    public void afterTestMethod() {
        System.out.println("AfterTestMethod");
    }
    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("before class test");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("after class test");
    }


    @Test
    public void Test2() {
        System.out.println("test 2+2=4");
        Assert.assertEquals(4, 2 + 2);
    }

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setupMockMvc() throws Exception {
        MockMvc build = MockMvcBuilders.webAppContextSetup(wac).build();
        build.perform(MockMvcRequestBuilders.request(HttpMethod.GET, ""));

    }

}

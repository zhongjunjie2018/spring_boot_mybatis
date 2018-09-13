package com.zjj.spring;

import com.zjj.spring.model.Student;
import com.zjj.spring.model.User;
import com.zjj.spring.service.StudentService;
import com.zjj.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private StudentService studentService;

    @Test
    public void testSt(){

        studentService.removeStudent("张宝磊");
    }

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("age", "18");
        String val = redisTemplate.opsForValue().get("age");
        System.out.println(val);
        //Assert.assertEquals("guanguan", val);
    }

    @Test
    public void test查询(){
        User user = new User();
        user.setUserName("堡垒");
        user.setPassWord("123456");
        user.setAge(28);
        userService.addUser(user);
    }
}

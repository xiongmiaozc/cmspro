package com.cms.portal.controller.admin;


import com.cms.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("test")
    public  String test(){
        return "/admin/test/index";
    }

    @GetMapping("test2")
    public  void  test2(){
        redisTemplate.opsForValue().set("zc","123123");

    }
}

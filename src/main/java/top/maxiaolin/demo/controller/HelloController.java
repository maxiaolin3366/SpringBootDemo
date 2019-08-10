package top.maxiaolin.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.maxiaolin.demo.service.IUserInfoService;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private IUserInfoService userInfoService;
    @RequestMapping("/hello")
    public Object hello(String phone){
        return userInfoService.getOne(phone);
    }
}

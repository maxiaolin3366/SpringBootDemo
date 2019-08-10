package top.maxiaolin.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.maxiaolin.demo.service.IUserInfoService;

import javax.annotation.Resource;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Resource
    private IUserInfoService userInfoService;
    @RequestMapping("/hello")
    public Object hello(String phone){
        logger.debug("访问到该接口----");
        return userInfoService.getOne(phone);
    }
}

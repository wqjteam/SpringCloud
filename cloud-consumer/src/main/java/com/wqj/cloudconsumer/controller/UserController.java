package com.wqj.cloudconsumer.controller;

import com.wqj.cloudconsumer.rpc.RpcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wqj
 * @Date: 2018/11/2 16:24
 * @Description:
 */
@RestController
@RefreshScope //springconf的自动更新
@RequestMapping(value = "/consumer")
public class UserController {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    public RpcUserService userService;

    @Value("${wexin.name}") //springconf的引入注解
    private String name;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Object provider1(Long id) {
        return userService.provider1(id);
    }

    @RequestMapping(value = "/config")
    public Object testConfig(Long id) {
        return name;
    }
}

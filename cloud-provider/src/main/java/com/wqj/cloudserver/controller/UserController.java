package com.wqj.cloudserver.controller;

import com.wqj.cloudserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wqj
 * @Date: 2018/10/31 17:09
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object provider1(Long id) {
        return userService.findUserById(id);
    }
}

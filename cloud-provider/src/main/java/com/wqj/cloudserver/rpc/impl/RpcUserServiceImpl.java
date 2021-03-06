package com.wqj.cloudserver.rpc.impl;

import com.wqj.cloudserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wqj
 * @Date: 2018/10/31 17:09
 * @Description:
 */
@RestController
@RequestMapping(value = "/service")
public class RpcUserServiceImpl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public Object provider1(Long id) {
        return userService.findUserById(id);
    }
}

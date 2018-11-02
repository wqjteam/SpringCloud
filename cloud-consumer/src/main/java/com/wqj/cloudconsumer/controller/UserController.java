package com.wqj.cloudconsumer.controller;

import com.wqj.cloudconsumer.rpc.RpcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wqj
 * @Date: 2018/11/2 16:24
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    public RpcUserService userService;

    @RequestMapping(value = "/hell", method = RequestMethod.GET)
    public Object provider1(Long id) {
        return userService.provider1(id);
    }
}

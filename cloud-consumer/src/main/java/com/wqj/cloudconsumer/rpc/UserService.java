package com.wqj.cloudconsumer.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wqj
 * @Date: 2018/11/2 16:21
 * @Description:
 */
@FeignClient("cloud-provider")
public interface UserService {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    Object provider1(Long id);
}

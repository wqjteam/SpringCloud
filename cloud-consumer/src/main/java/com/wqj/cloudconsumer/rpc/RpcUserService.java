package com.wqj.cloudconsumer.rpc;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: wqj
 * @Date: 2018/11/2 16:21
 * @Description:
 */
@FeignClient("cloud-provider")
public interface RpcUserService {


    @RequestMapping(value = "/hello")
    Object provider1(@RequestParam(value = "id")Long id);
}

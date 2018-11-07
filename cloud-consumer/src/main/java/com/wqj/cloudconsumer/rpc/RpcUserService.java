package com.wqj.cloudconsumer.rpc;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: wqj
 * @Date: 2018/11/2 16:21
 * @Description:
 */
//fallback 是Hystrix熔断器的注解,访问出现问题时调用此类
@FeignClient(name="cloud-provider",fallback = RpcUserServiceCallback.class )
public interface RpcUserService {


    @RequestMapping(value = "/service/getUser")
    Object provider1(@RequestParam(value = "id")Long id);
}


//回调方法
@Component
class RpcUserServiceCallback implements  RpcUserService{

    @Override
    public Object provider1(Long id) {

        System.out.println("发生错误,进行熔断");
        return "发生错误了";
    }
}

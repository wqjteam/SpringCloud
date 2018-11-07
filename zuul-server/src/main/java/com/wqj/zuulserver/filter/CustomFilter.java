package com.wqj.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: wqj
 * @Date: 2018/11/7 16:04
 * @Description:
 */

@Component
public class CustomFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //枚举值：pre:转发前, routing:转法时, post:, error:发生错误时
        return "pre";
    }

    @Override
    public int filterOrder() {
        //优先级, 0是最高优先级即最先执行
        return 0;
    }

    //是否需要执行过滤。true会执行run函数，false不执行run函数
    @Override
    public boolean shouldFilter() {
        System.out.println("路由转发进入到此");
        return true;
    }

    @Override
    public Object run() {
        //编写逻辑
        //1.返回值为null
        //2.返回的内容在response中
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object id = request.getParameter("id");
        System.out.println("id为:"+id);
        return null;
    }
}

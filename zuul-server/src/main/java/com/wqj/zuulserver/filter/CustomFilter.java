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
        //枚举值：pre:可以在请求被路由之前调用, routing:在路由请求时候被调用, post:在routing和error过滤器之后被调用, error:处理请求时发生错误时被调用
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

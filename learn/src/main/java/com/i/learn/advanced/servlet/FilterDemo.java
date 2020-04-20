package com.i.learn.advanced.servlet;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

@Configuration
public class FilterDemo implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Map<String,String[]> map = servletRequest.getParameterMap();
        for(Map.Entry<String,String[]> entry : map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue()[0]);
        }
        // 把请求传回过滤链
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}

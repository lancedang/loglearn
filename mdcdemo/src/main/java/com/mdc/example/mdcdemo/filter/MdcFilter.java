package com.mdc.example.mdcdemo.filter;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class MdcFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //not care
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        String clientname = request.getParameter("clientname");
        //System.out.println("clientname=" + clientname);
        MDC.put("clientname", clientname);
        //程序继续执行下一个 filter
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.remove("clientname");
        }

    }

    @Override
    public void destroy() {

    }
}
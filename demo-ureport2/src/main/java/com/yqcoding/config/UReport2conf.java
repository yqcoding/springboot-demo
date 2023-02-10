package com.yqcoding.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName UReport2conf
 * @Description 修改保存位置
 * @Author yaoqiang
 * @Date 2023/2/10 15:22
 * @Version 1.0
 */
@Configuration
@ImportResource(locations = {"classpath:context.xml"})
public class UReport2conf {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new UReportServlet(),"/ureport/*");
    }
}
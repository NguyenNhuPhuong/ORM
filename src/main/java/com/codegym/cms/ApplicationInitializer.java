package com.codegym.cms;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// lớp ApplicationInitializer là lớp cấu hình khởi tạo cho ứng dụng ( thay thế file web.xml néu dùng cấu hình xml)
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

package com.jzw;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class,args);
    }

    @Bean
    public ViewResolver myViewresolver(){
        return new MyViewResolver1();
    }

    private static class MyViewResolver1 implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
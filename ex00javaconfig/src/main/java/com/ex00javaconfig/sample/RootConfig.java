package com.ex00javaconfig.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ex00javaconfig.sample"})
//니가 만든 패키지 중 스프링에서 관리해야할 패키지가 어디있니 라는 뜻
public class RootConfig {

}
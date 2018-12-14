package com.example.jfilterdemo;

import com.jfilter.EnableJsonFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@EnableJsonFilter
@ComponentScan({"com.jfilter.components"})
public class AppConfig implements WebMvcConfigurer {
}
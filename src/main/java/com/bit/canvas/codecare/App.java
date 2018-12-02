package com.bit.canvas.codecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @author : r0v0040 (Rituraj.Vats@walmartlabs.com)
 * Date : 01/08/18
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.bit.canvas.codecare"})
public class App {
    @PostConstruct
    public void init(){
        // Setting Spring Boot SetTimeZone
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

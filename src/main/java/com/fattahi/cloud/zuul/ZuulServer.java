package com.fattahi.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by m.fattahi on 4/19/2016.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableHystrix
public class ZuulServer {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServer.class, args);
	}
}

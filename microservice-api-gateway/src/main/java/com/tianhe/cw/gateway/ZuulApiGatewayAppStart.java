package com.tianhe.cw.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 使用@EnableZuulProxy注解激活zuul。
 * 跟进该注解可以看到该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置。
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayAppStart {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApiGatewayAppStart.class, args);
  }
}
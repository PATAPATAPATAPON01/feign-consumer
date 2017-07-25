package spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2017/7/25 18:01
 * DESC:
 */
@FeignClient("hello-service") //这里的服务名 不区分大小写，hello-service和 HELLO-SERVICE都可以
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}

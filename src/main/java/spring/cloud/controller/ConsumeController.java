package spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.service.HelloService;

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2017/7/25 18:06
 * DESC:
 */
@RestController
public class ConsumeController {

    @Autowired
    private HelloService helloService;


    public String helloConsumer() {
        return helloService.hello();
    }
}

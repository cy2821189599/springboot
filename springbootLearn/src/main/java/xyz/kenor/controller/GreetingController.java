package xyz.kenor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.kenor.bean.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ：kenor
 * @date ：Created in 2020/8/16 8:59
 * @description：
 * @version: 1.0
 */
@RestController //@Controller and @ResponseBody
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

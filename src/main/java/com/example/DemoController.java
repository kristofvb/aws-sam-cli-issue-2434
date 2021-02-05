package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class DemoController {
    @Get
    String hello() {
        return "hello world";
    }
}

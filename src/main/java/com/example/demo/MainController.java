package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String root() {
        return "ROOT";
    }

    @RequestMapping(value = "/greet", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String greet() {
        return "{\"id\": 1, \"message\": \"Hello World!!!\"}";
    }

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String greetWithParam(@PathVariable("name") String name) {
        return "{\"id\": 1, \"message\": \"Hello World " + name + "!!!\"}";
    }

    @RequestMapping(value = "/greetParams", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String greetWithUrlParam(@RequestParam String name, @RequestParam String surname) {
        return "{\"id\": 1, \"message\": \"Hello World " + name + " " + surname + "!!!\"}";
    }
}

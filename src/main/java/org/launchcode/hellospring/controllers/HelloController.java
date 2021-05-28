package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping(value="hello")//says every method w/i this class should begin w/ /hello
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }
    @GetMapping("hi")
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }
}
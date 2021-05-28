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
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
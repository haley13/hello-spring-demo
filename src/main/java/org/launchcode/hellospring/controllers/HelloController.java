package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method= 'POST' action = '/hello'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                //"<input type = 'text' language= 'language" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
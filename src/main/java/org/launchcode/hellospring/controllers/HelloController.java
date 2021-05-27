package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")//says every method w/i this class should begin w/ /hello
public class HelloController {
    //handles request at path/hello
    //lives a /hello
    @GetMapping("hello")
    //specifies that this method should handle get requests, only accept get requests
    //tells springboot that this method will return a plain text html response
    public String hello() {
        return "Hello, Spring!";
    }
    //lives a /hello/goodbye
    @GetMapping("goodbye")
    //specifies that this method should handle get requests, only accept get requests
    //tells springboot that this method will return a plain text html response
    public String goodbye() {
        return "Goodbye, Spring!";
    }
    //lives/hello/hello
    //handles request of the form /hello?name=LaunchCode
    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value="hello")//GENERAL instead of get or post

    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello," + name + "!";
    }
    //handles request of form /hello/LaunchCode
    //
    @GetMapping("hello/{name}")

    public String helloWithPathParam(@PathVariable String name){
        return "Hello," + name + "!";
    }
    @GetMapping("form")
    //lives /hello/form
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +//submit a request to /hello
                "<input type= 'text' value = 'Greet me!'> " +
                "<form>" +
                "<body>" +
                "</html>";
    }
}

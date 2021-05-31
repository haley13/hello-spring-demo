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

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<form method='post'>" +
                "<input type= 'text' name= 'name'>" +
                "<select name = 'language'>" +
                "<option value= 'english'> English </option>" +
                "<option value= 'french'> French </option>" +
                "<option value= 'italian'> Italian </option>" +
                "<option value= 'spanish'> Spanish </option>" +
                "<option value= 'german'> German </option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        String greeting = "";
        if (language.equals("english")) {
            greeting = "Hello, ";

        } else if (language.equals("french")) {
            greeting = "Bonjour, ";

        } else if (language.equals("italian")) {
            greeting = "Buongiorno, ";

        } else if (language.equals("spanish")) {
            greeting = "Hola, ";

        } else if (language.equals("german")) {
            greeting = "Hallo, ";
        }
        return "<p style= 'color: red; text-align: center; margin-top: 20vb; font-size: 30px'>" + greeting + name + "</p>";
    }
}
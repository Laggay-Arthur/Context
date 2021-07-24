package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

   @RequestMapping(value = "/home")
   public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
       model.addAttribute("name", name);
       return "home";
   }

}
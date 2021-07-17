package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FirstController {
    @GetMapping("/")
    public String IndexPage() {
        return "index";
    }

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "jinseok");
        return "greet"; // templates/greet.mustache 를 찾아서 브라우저로
    }
    @GetMapping("/bye")
    public String SeeYouAgain(Model model){
        model.addAttribute("username", "jinseok");
        return"greet2";
    }
}

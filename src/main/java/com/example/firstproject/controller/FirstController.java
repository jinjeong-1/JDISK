package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/article/new")
    public String newArticleForm(){
        return "article/new";
    }
    @PostMapping("/article/create")
    public String creatArticle(ArticleForm form){
        System.out.println(form.toString());
        return"";
    }

}

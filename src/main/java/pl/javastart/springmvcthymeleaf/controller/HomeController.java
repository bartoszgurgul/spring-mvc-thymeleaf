package pl.javastart.springmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.springmvcthymeleaf.model.Article;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("helloMessage","Title hhehehhehe");
        model.addAttribute("formArticle"
                , new Article("Some title", "Context here...", "tag1, tag2..."));
        return "index";
    }
}

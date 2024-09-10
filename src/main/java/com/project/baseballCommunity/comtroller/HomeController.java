package com.project.baseballCommunity.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/baseball")
    public String mainPage(){
        return "index";
    }




}

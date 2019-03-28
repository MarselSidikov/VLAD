package ru.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String getAboutPage(Model model) {
        List<String> technologyNames = new ArrayList<>();

        technologyNames.add("Java");
        technologyNames.add("Spring Boot");
        technologyNames.add("Spring Data Jpa");
        technologyNames.add("Maven");
        technologyNames.add("PosgtreSQL");

        model.addAttribute("technologies", technologyNames);
        return "about_view";
    }
}

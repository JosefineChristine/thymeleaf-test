package com.example.thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("something", "this is coming from til controller");
        model.addAttribute("people", Arrays.asList(
                new Person("Josefine", 29),
                new Person("Fri", 2),
                new Person("Emil", 29)
        ));
        return "people";
    }

}

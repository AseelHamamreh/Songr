package com.songrApp.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class capitalizeController {
    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text, Model myModel) {
        myModel.addAttribute("text", text.toUpperCase());
        return "capitalized";
    }
}

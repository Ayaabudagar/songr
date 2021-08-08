package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalized {
    @GetMapping("/Capitalize/{upperCase}")
    public String Capitalized (@PathVariable String upperCase , Model newModel  ){
        String newUpperCase = upperCase.toUpperCase();
        newModel.addAttribute("capitalizedText" , newUpperCase);
        return "Capitalize.html";

    }
}

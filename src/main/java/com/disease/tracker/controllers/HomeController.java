package com.disease.tracker.controllers;

import com.disease.tracker.services.DataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    DataServices dataServices;

    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("locationStats", dataServices.getAllStats());
        return "home";
    }
}

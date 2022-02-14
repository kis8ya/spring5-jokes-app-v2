package com.github.kis8ya.spring5jokesapp.controllers;

import com.github.kis8ya.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "jokes/get";
    }

}

package com.spring5.joke.controllers;

import com.spring5.joke.services.IJokeQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private IJokeQuoteService jokeQuoteService;

    @Autowired
    public JokeController(IJokeQuoteService jokeQuoteService) {
        this.jokeQuoteService = jokeQuoteService;
    }

    @RequestMapping({"/",""})
    public String showJokeQuote(Model model){
        model.addAttribute("jokeQuote",jokeQuoteService.getRandomJokeQuote());

        return "chuckNorris";
    }
}

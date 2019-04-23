package com.jokesapp.springjokes.controller;


import com.jokesapp.springjokes.model.Joke;
import com.jokesapp.springjokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

private JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
public String getJoke(Model model){
        Joke joke=jokeService.getJoke();
        model.addAttribute("joke",joke);
        return "index";

}
}

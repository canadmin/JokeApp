package com.jokesapp.springjokes.service;

import com.jokesapp.springjokes.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class SpringJokeImpl implements JokeService{



    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public  SpringJokeImpl(){
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    @Override
    public Joke getJoke() {
        Joke joke=new Joke();
        joke.setJoke(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
}

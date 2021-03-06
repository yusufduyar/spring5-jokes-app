package com.spring5.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeQuoteServiceImpl implements IJokeQuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeQuoteServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJokeQuote() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}

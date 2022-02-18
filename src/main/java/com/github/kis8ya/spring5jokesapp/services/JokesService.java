package com.github.kis8ya.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotesProvider;

    public JokesService(ChuckNorrisQuotes quotesProvider) {
        this.quotesProvider = quotesProvider;
    }

    public String getJoke() {
        return quotesProvider.getRandomQuote();
    }

}

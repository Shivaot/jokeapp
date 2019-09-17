package guru.springframework.joke.jokeapp.service;

import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService {


    private final ChuckNorrisQuotesMy chuckNorrisQuotesMy;

    public JokeServiceImpl(ChuckNorrisQuotesMy chuckNorrisQuotesMy) {
        this.chuckNorrisQuotesMy = chuckNorrisQuotesMy;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotesMy.getRandomQuote();
    }
}

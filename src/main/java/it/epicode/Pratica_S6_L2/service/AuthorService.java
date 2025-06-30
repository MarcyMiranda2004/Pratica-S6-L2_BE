package it.epicode.Pratica_S6_L2.service;

import it.epicode.Pratica_S6_L2.models.Author;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    private List<Author> autori;

    public Author save(Author author) {
        author.setId(new Random(().nextInt(1 2000));
        return author;
    }
}

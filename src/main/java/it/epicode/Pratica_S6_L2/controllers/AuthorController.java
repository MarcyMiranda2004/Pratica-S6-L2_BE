package it.epicode.Pratica_S6_L2.controllers;
import it.epicode.Pratica_S6_L2.models.Author;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private List<Author> authors = new ArrayList<>();

    @GetMapping
    public List<Author> getAll() {
        return authors;
    }

    @GetMapping("/{id}")
    public Author getOne(@PathVariable Long id) {
        return authors.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public Author create(@RequestBody Author newAuthor) {
        newAuthor.setAvatar("https://ui-avatars.com/api/?name=" + newAuthor.getNome() + "+" + newAuthor.getCognome());
        authors.add(newAuthor);
        return newAuthor;
    }

    @PutMapping("/{id}")
    public Author update(@PathVariable Long id, @RequestBody Author updated) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getId().equals(id)) {
                updated.setId(id);
                updated.setAvatar("https://ui-avatars.com/api/?name=" + updated.getNome() + "+" + updated.getCognome());
                authors.set(i, updated);
                return updated;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authors.removeIf(a -> a.getId().equals(id));
    }
}

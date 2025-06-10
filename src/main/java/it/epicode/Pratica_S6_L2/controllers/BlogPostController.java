package it.epicode.Pratica_S6_L2.controllers;
import it.epicode.Pratica_S6_L2.models.BlogPost;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {

    private List<BlogPost> blogPosts = new ArrayList<>();

    @GetMapping
    public List<BlogPost> getAll() {
        return blogPosts;
    }

    @GetMapping("/{id}")
    public BlogPost getOne(@PathVariable Long id) {
        return blogPosts.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public BlogPost create(@RequestBody BlogPost newPost) {
        blogPosts.add(newPost);
        return newPost;
    }

    @PutMapping("/{id}")
    public BlogPost update(@PathVariable Long id, @RequestBody BlogPost updated) {
        for (int i = 0; i < blogPosts.size(); i++) {
            if (blogPosts.get(i).getId().equals(id)) {
                updated.setId(id);
                blogPosts.set(i, updated);
                return updated;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        blogPosts.removeIf(p -> p.getId().equals(id));
    }
}

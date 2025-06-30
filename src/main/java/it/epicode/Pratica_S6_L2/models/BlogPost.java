package it.epicode.Pratica_S6_L2.models;

import lombok.Data;

@Data
public class BlogPost {

    private Long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPost() {
        this.id = idCounter++;
        this.cover = "https://picsum.photos/200/300";
    }
}
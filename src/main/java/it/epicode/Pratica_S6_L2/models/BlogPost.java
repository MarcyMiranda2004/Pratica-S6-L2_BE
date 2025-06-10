package it.epicode.Pratica_S6_L2.models;

public class BlogPost {
    private static long idCounter = 1;

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
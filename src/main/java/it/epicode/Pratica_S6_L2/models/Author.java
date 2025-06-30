package it.epicode.Pratica_S6_L2.models;

import lombok.Data;

@Data
    public class Author {

        private Long id;
        private String nome;
        private String cognome;
        private String email;
        private String dataDiNascita;
        private String avatar;

        public Author() {
            this.id = idCounter++;
            this.avatar = "https://ui-avatars.com/api/?name=Default+Name";
        }
    }

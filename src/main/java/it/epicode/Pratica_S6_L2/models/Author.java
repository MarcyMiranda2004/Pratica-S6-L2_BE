package it.epicode.Pratica_S6_L2.models;

    public class Author {
        private static long idCounter = 1;

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

package com.example.tp;

public class Main {
    public static void main(String[] args) {
        // Création d’auteurs
        Auteur hugo   = new Auteur("Victor Hugo");
        Auteur orwell = new Auteur("George Orwell");

        // Création de livres (liaison avec auteur automatique)
        Livre m1    = new Livre("Les Misérables", hugo);
        Livre ndp   = new Livre("Notre-Dame de Paris", hugo);
        Livre l1984 = new Livre("1984", orwell);

        // Création de bibliothèques
        Bibliotheque centrale = new Bibliotheque("Centrale");
        Bibliotheque quartier = new Bibliotheque("Quartier");

        // Associations bibliothèque ↔ livres
        centrale.ajouterLivre(m1);
        centrale.ajouterLivre(l1984);
        quartier.ajouterLivre(m1);
        quartier.ajouterLivre(ndp);

        // Affichage auteurs et leurs livres
        System.out.println(hugo);
        hugo.getLivres().forEach(l ->
            System.out.println("  • " + l)
        );

        System.out.println(orwell);
        orwell.getLivres().forEach(l ->
            System.out.println("  • " + l)
        );

        // Affichage bibliothèques et leur collection
        System.out.println(centrale);
        centrale.getCollection().forEach(l ->
            System.out.println("  – " + l.getTitre() + " (id=" + l.getId() + ")")
        );

        System.out.println(quartier);
        quartier.getCollection().forEach(l ->
            System.out.println("  – " + l.getTitre() + " (id=" + l.getId() + ")")
        );
    }
}
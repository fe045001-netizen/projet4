package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {
    public static void main(String[] args) {
     
        Categorie c1 = new Categorie("Ordinateur Portable", "O PR");
        Categorie c2 = new Categorie("Ordinateur Poste", "O PO");

   
        Categorie[] categories = { c1, c2 };

        Article a1 = new Article(14, "DELL INSPIRON", c1);
        Article a2 = new Article(4, "SONY VAIO", c1);
        Article a3 = new Article(74, "TERRA", c2);
        Article a4 = new Article(785, "HP Compaq", c2);

        Article[] articles = { a1, a2, a3, a4 };


        for (Categorie cat : categories) {
            System.out.println(cat.getLibelle() + " :");
            for (Article art : articles) {
                if (art.getCategorie().getId() == cat.getId()) {
                    System.out.println("  - " + art.toString());
                }
            }
            System.out.println();
        }
    }
}

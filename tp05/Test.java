
import java.util.Scanner;

public class Test {

    public static Liste creationListe(Liste L, int N) {
        Scanner scr = new Scanner(System.in);
        L = Liste.listeVide();
        for (int i = 0; i < N; i++) {
            int id = scr.nextInt();
            Element e = new Element(id);
            L = Liste.inserer(L, i, e);
        }
        return L;
    }

    public static void affichageListe(Liste L) {
        for (int i = 0; i < L.longueur_iter(L); i++) {
            System.out.println(L.acces(L, i).getId());
        }
    }

    public static void main(String[] args) {
        Liste liste1 = new Liste();
        Scanner scr = new Scanner(System.in);
        System.out.println("Entrer size la liste1 :");
        int size = scr.nextInt();
        System.out.println("Entrer les éléments de la liste1 :");
        liste1 = creationListe(liste1, size);
        if (Liste.estVide(liste1)) {
            System.out.println("La liste1 est vide");
        } else {
            System.out.println("Les éléments de la liste1 sont : ");
            affichageListe(liste1);
        }

        // part 2
        if (Liste.estVide(liste1)) {
            System.out.println("La liste1 est vide");
        } else if (liste1.longueur_iter(liste1) == 1) {
            System.out.println("Le élément de la liste1 est : ");
            affichageListe(liste1);
        } else {
            System.out.println("Le dernier élément est : ");
            System.out.println(liste1.queue(liste1).getId());
        }

        // part 3
        Liste liste2 = new Liste();
        System.out.println("Entrer size la liste2 :");
        size = scr.nextInt();
        System.out.println("Entrer les éléments de la liste2 :");
        liste2 = creationListe(liste2, size);
        if (Liste.estVide(liste2)) {
            System.out.println("La liste2 est vide");
        } else {
            System.out.println("Les éléments de la liste2 sont : ");
            affichageListe(liste2);
        }

        if (Liste.estVide(liste1) && Liste.estVide(liste2)) {
            System.out.println("le résultat de la concaténation est une liste vide");
        } else if (Liste.estVide(liste1)) {
            System.out.println("le résultat de la concaténation est: ");
            affichageListe(liste2);
        } else if (Liste.estVide(liste2)) {
            System.out.println("le résultat de la concaténation est: ");
            affichageListe(liste1);
        } else if ((liste1.longueur_iter(liste1) + liste2.longueur_iter(liste2)) > Liste.getLMAX()) {
            System.out.println("la concaténation est impossible");
        } else {
            System.out.println("la concatener de list 1 et 2");
            Liste liste3 = Liste.concatener(liste1, liste2);
            affichageListe(liste3);
        }

        // part 4
        if (Liste.estVide(liste1)) {
            System.out.println("La liste1 est vide");
        } else {
            System.out.println("Les éléments de la liste1 inversée sont : ");
            affichageListe(Liste.inverse(liste1));
        }
    }
}

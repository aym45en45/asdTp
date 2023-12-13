public class Main {

    public static void main(String[] args) {
        Liste liste1 = new Liste();
        System.out.println("Entrer les éléments de la liste1 :");
        Liste.creationListe(liste1, 4);
        liste1.estVide(liste1);

        if (liste1.estVide(liste1)) {
            System.out.println("La liste1 est vide");
        } else {
            System.out.println("Les éléments de la liste1 sont : ");
            Liste.affichageListe(liste1);
        }

        System.out.println("Le dernier élément est : ");
        System.out.println(liste1.queue(liste1).getid());

        if (liste1.estVide(liste1)) {
            System.out.println("La liste1 est vide");
        } else {
            System.out.println("Les éléments de la liste1 inversée sont : ");
            liste1.inverse(liste1);
            Liste.affichageListe(liste1);
        }

        System.out.println("Le dernier élément est : ");
        System.out.println(liste1.queue(liste1).getid());

        Liste liste2 = new Liste();
        System.out.println("Entrer les éléments de la liste2 :");
        Liste.creationListe(liste2, 2);
        liste2.estVide(liste2);

        if (liste2.estVide(liste2)) {
            System.out.println("La liste2 est vide");
        } else {
            System.out.println("Les éléments de la liste2 sont : ");
            Liste.affichageListe(liste2);
        }

        System.out.println("Le dernier élément est : ");
        System.out.println(liste2.queue(liste2).getid());

        Liste listeConcatenated = new Liste();
        Liste.creationListe(listeConcatenated, 0);
        listeConcatenated.concatener(liste1, liste2);
        listeConcatenated.estVide(listeConcatenated);

        if (listeConcatenated.estVide(listeConcatenated)) {
            System.out.println("La liste concaténée est vide");
        } else {
            System.out.println("Les éléments de la liste concaténée sont : ");
            Liste.affichageListe(listeConcatenated);
        }
    }
}


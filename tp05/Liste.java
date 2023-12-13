import java.util.Scanner;

public class Liste {
    private static final int LMAX = 1000;
    private Element tab[];
    private int longueur_liste;

    public Liste() {
        tab = new Element[LMAX];
        longueur_liste = 0;
    }

    public Liste listeVide() {
        Liste L = new Liste();
        L.tab = null;
        L.longueur_liste = 0;
        return L;
    }

    public Liste inserer(Liste L, int p, Element e) {
        if (L.longueur_liste < LMAX) {
            if (L.longueur_liste != 0 && p != (L.longueur_liste + 1)) {
                for (int j = L.longueur_liste - 1; j >= p; j--) {
                    L.tab[j + 1] = L.tab[j];
                }
            }
            L.tab[p] = e;
            L.longueur_liste++;
        } else {
            System.out.println("l’insertion est impossible, la liste est saturee");
        }
        return L;
    }

    public Liste supprimer(Liste L, int p) {
        if (L.longueur_liste != 1) {
            for (int j = p; j >= L.longueur_liste - 1; j--) {
                L.tab[j] = L.tab[j + 1];
            }
        }
        L.longueur_liste = L.longueur_liste - 1;
        return L;
    }

    public Element acces(Liste L, int p) {
        return L.tab[p];
    }

    public int longueur_iter(Liste L) {
        return L.longueur_liste;
    }

    public int longueur_rec(Liste L) {
        if (L == listeVide())
            return 0;
        else
            return longueur_rec(supprimer(L, 1)) + 1;
    }

    public boolean estVide(Liste L) {
        return L == listeVide();
    }

    public static Liste creationListe(Liste L, int N) {
        Scanner scr = new Scanner(System.in);
        L.listeVide();
        for (int i = 0; i < N; i++) {
            int id = scr.nextInt();
            Element e = new Element(id);
            L.inserer(L, i, e);
        }
        return L;
    }

    public static void affichageListe(Liste L) {
        for (int i = 0; i < L.longueur_iter(L); i++) {
            System.out.println(L.acces(L, i).getid());
        }
    }

    public Element queue(Liste L) {
        return L.tab[L.longueur_liste - 1];
    }

    public Liste concatener(Liste L1, Liste L2) {
        Liste L3 = new Liste();
        for (int i = 0; i < L1.longueur_liste - 1; i++) {
            Element A = L1.acces(L1, i);
            L3.inserer(L3, i, A);
        }
        for (int i = 0; i < L2.longueur_liste - 1; i++) {
            Element A = L2.acces(L2, i);
            L3.inserer(L3, L1.longueur_liste + i, A);
        }
        return L3;
    }

    public Liste inverse(Liste L) {
        Liste ListeInv = new Liste();
        for (int i = L.longueur_liste - 1; i >= 0; i--) {
            Element element = L.acces(L, i);
            ListeInv.inserer(ListeInv, i, element);
        }
        return ListeInv;
    }
}


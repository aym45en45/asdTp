
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
                for (int i = L.longueur_liste - 1; i >= p; i--) {
                    L.tab[i + 1] = L.tab[i];
                }
            }
            L.tab[p] = e;
            L.longueur_liste++;
        } else {
            System.out.println("L'insertion est impossible, la liste est saturée");
        }
        return L;
    }

    public Liste supprimer(Liste L, int p) {
        if (L.longueur_liste != 1) {
            for (int j = p; j >= L.longueur_liste - 1; j--) {
                L.tab[j] = L.tab[j + 1];
            }
        }
        L.longueur_liste--;
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



    public Element queue(Liste L) {
        return L.tab[L.longueur_liste - 1];
    }

    public Liste concatener(Liste L1, Liste L2) {
        Liste L3 = new Liste();
        for (int i = 0; i < L1.longueur_liste ; i++) {
            Element A = L1.acces(L1, i);
            L3.inserer(L3, i, A);
        }
        for (int i = 0; i < L2.longueur_liste ; i++) {
            Element A = L2.acces(L2, i);
            L3.inserer(L3, L1.longueur_liste + i, A);
        }
        return L3;
    }

    public Liste inverse(Liste L) {
        Liste ListeInv = new Liste();
        for (int i = L.longueur_liste - 1,  j=0;i >= 0 && j<=L.longueur_liste - 1; i-- ,j++) {
            Element element = L.acces(L, i);
            ListeInv.inserer(ListeInv, j, element);
        }
        return ListeInv;
    }
    public static int getLMAX(){
	return LMAX;
    }
}

public abstract class Tableau {
    Etudiant[] tab = new Etudiant[5];
    Etudiant[] tabTrie = new Etudiant[5];

    public Tableau(Etudiant[] tab, Etudiant[] tabTrie) {
        this.tab = tab;
        this.tabTrie = tabTrie;
    }

    public void afficher(Etudiant[] tab) {
        System.out.println("Etudiant list without tri");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
    }

    public void afficherTrie(Etudiant[] tab) {
        triBulle(tab);
        System.out.println("----------------------");
        System.out.println("Etudiant list with triBulle");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
        triInsertion(tab);
        System.out.println("----------------------");
        System.out.println("Etudiant list with triInsertion");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
        triSelection(tab);
        System.out.println("----------------------");
        System.out.println("Etudiant list with triSelection");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
    }

    public abstract void triBulle(Etudiant[] tabTri);

    public abstract void triInsertion(Etudiant[] tabTrie);

    public abstract void triSelection(Etudiant[] tabTrie);
    
}

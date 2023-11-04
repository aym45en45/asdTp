public abstract class Tableau {
    Etudiant[] tab;
    Etudiant[] tabTrie;

    public Tableau(Etudiant[] tab, Etudiant[] tabTrie) {
        this.tab = tab;
        this.tabTrie = tabTrie;
    }

    public void afficher(Etudiant[] tab) {
        System.out.println("Etudiant list without tri");
        for (int i = 0; i < tab.length; i++) {
            System.out.println((i + 1) + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
    }

    public void afficherTrie(Etudiant[] tabTrie) {
        System.out.println("----------------------");
        System.out.println("Etudiant list with triBulle");
        for (int i = 0; i < tabTrie.length; i++) {
            System.out.println((i + 1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom + " " + tabTrie[i].note);
        }

        /*
         * System.out.println("----------------------");
         * System.out.println("Etudiant list with triSelection");
         * for (int i = 0; i < tabTrie.length; i++) {
         * System.out.println((i+1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom
         * + " " + tabTrie[i].note);
         * }
         * System.out.println("----------------------");
         * System.out.println("Etudiant list with triInsertion");
         * for (int i = 0; i < tabTrie.length; i++) {
         * System.out.println((i+1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom
         * + " " + tabTrie[i].note);
         * }
         */

    }

    public abstract void triBulle();

    public abstract void triInsertion();

    public abstract void triSelection();

}

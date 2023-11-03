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
            System.out.println((i+1) + " : " + tab[i].name + " " + tab[i].prenom + " " + tab[i].note);
        }
    }

    public void afficherTrie(Etudiant[] tabTrie) {
        System.out.println("----------------------");
        System.out.println("Etudiant list with triBulle");
        for (int i = 0; i < tabTrie.length; i++) {
            System.out.println((i+1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom + " " + tabTrie[i].note);
        }
        /*  le temps d’exécution de triBulle 
            N=10 :  2.681s
            N=10^2 : 2.78s
            N=10^3 : 2.889s
            N=10^4 : 5.267s
            N=10^5 : 116.404s
        */
        System.out.println("----------------------");
        System.out.println("Etudiant list with triSelection");
        for (int i = 0; i < tabTrie.length; i++) {
            System.out.println((i+1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom + " " + tabTrie[i].note);
        }
        /*  le temps d’exécution de triSelection
            N=10 : 2.421s
            N=10^2 : 2.812s
            N=10^3 : 3.307s
            N=10^4 : 4.429s
            N=10^5 : 29.047s
        */
        System.out.println("----------------------");
        System.out.println("Etudiant list with triInsertion");
        for (int i = 0; i < tabTrie.length; i++) {
            System.out.println((i+1) + " : " + tabTrie[i].name + " " + tabTrie[i].prenom + " " + tabTrie[i].note);
        }
        /*  le temps d’exécution de triInsertion
            N=10 : 2.869s
            N=10^2 : 2.535s
            N=10^3 : 2.721s
            N=10^4 : 3.558s
            N=10^5 : 43.47s
        */
    }

    public abstract void triBulle();

    public abstract void triInsertion();

    public abstract void triSelection();
    
}

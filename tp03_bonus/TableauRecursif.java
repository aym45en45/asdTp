
public class TableauRecursif extends Tableau {

    Etudiant[] tab;
    Etudiant[] tabTrie;

    public TableauRecursif(Etudiant[] tab, Etudiant[] tabTrie) {
        super(tab, tabTrie);
        this.tab = tab;
        this.tabTrie = tabTrie;
    }

    @Override
    public void triBulle(Etudiant[] tabTrie, int i, int passage) {
        if (passage < tabTrie.length - 1) {
            if (i < tabTrie.length - passage - 1) {
                if (tabTrie[i].note < tabTrie[i + 1].note) {
                    Etudiant temp = tabTrie[i];
                    tabTrie[i] = tabTrie[i + 1];
                    tabTrie[i + 1] = temp;
                }
                triBulle(tabTrie, i + 1, passage);
            } else {
                triBulle(tabTrie, 0, passage + 1);
            }
        }
    }

    @Override
    public void triInsertion(Etudiant[] tabTrie, int i,int j) {
        
    }


    @Override
    public void triSelection() {
        
    }

}

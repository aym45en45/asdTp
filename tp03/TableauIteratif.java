public class TableauIteratif extends Tableau {
    Etudiant[] tab;
    Etudiant[] tabTrie;
    
    public TableauIteratif(Etudiant[] tab, Etudiant[] tabTrie) {
        super(tab, tabTrie);
        this.tab=tab;
        this.tabTrie=tabTrie;
    }

    @Override
    public void triBulle() {
        int passage = 0;
        boolean permutation = true;

        while (permutation) {
            permutation = false;
            passage++;
            for (int i = 0; i < tabTrie.length - passage; i++) {
                if (tabTrie[i].note < tabTrie[i + 1].note) {
                    permutation = true;
                    Etudiant temp = tabTrie[i];
                    tabTrie[i] = tabTrie[i + 1];
                    tabTrie[i + 1] = temp;
                }
            }
            
        }
    }

    @Override
    public void triInsertion() {
        Etudiant box;

    for (int i = 1; i < tabTrie.length; i++) {
        box = tabTrie[i];
        int j = i;
        while (j > 0 && tabTrie[j - 1].note < box.note) {
            tabTrie[j] = tabTrie[j - 1];
            j--;
        }
        tabTrie[j] = box;
    }
    }

    @Override
    public void triSelection() {
        int max;
        Etudiant temp;
    for (int i = 0; i < tabTrie.length - 1; i++) {
        max = i;
        for (int j = i + 1; j < tabTrie.length; j++) {
            if (tabTrie[j].note > tabTrie[max].note) {
                max = j;
            }   
        }
        temp = tabTrie[i];
        tabTrie[i] = tabTrie[max];
        tabTrie[max] = temp;
    }
    }   
}

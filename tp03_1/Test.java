/* 
ani riglt mchkl wala tablou tani mch null mais ja mchkl jdid
howa tablou lowl ga3d ytratb ki n3ayt b3d l method tab.triBulle(); star 39
ki nafichi tablou bl method tab.afficher(etudiant); star 42 ykhrj mratb
 */


import java.text.DecimalFormat;
import java.util.Random;

public class Test {
    
    private static final int N = 20;
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {

        Etudiant[] etudiant = new Etudiant[N];
        Etudiant[] etudiantTri = new Etudiant[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            String name = getRandomName();
            String prenom = getRandomPrenom();
            float note = random.nextFloat(20);

            DecimalFormat df = new DecimalFormat("#.##");// thaz 2 number mora fasila
            note = Float.parseFloat(df.format(note));

            etudiant[i] = new Etudiant(name, prenom, note);
        }
        etudiantTri=etudiant;
        TableauIteratif tab = new TableauIteratif(etudiant, etudiantTri);
        tab.triBulle();
        tab.triSelection();
        tab.triInsertion();
        tab.afficher(etudiant);
        tab.afficherTrie(etudiantTri);

        if (RechercheSequentielle(etudiantTri, etudiant[6].note))
            System.out.println("the note " + etudiant[6].note + " exst");
        else
            System.out.println("the note " + etudiant[6].note + " not exst");
    }

    public static String getRandomName() {
        Random random = new Random();
        int randomIndex = random.nextInt(NAMES.length);
        return NAMES[randomIndex];
    }

    public static String getRandomPrenom() {
        Random random = new Random();
        int randomIndex = random.nextInt(PRENOMS.length);
        return PRENOMS[randomIndex];
    }

    public static boolean RechercheSequentielle(Etudiant[] etudiantTri, float value) {
        boolean found = false;
        int start = 0;
        int end = etudiantTri.length - 1;

        while (start <= end && !found) {
            int middle = (start + end) / 2;
            if (etudiantTri[middle].note == value) {
                found = true;
            } else {
                if (value < etudiantTri[middle].note) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }

        return found;
    }
}

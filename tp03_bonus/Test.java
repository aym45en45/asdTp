
/* 
 * dart triBulle mchat mais 2 method triSelection et triInsertion mdrthomch
 * 
 * kayn error ki dir N = 1000 
 * 
 * le temps d’exécution de triBulle 
 * N=10 :  2.472s
 * N=10^2 : 2.596s
 * N=10^3 : s
 * N=10^4 : s
 * N=10^5 : s
 * 
 */
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Test {

    private static final int N = 10000;
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {

        Etudiant[] etudiant = new Etudiant[N];

        Random random = new Random();
        for (int i = 0; i < etudiant.length; i++) {
            String name = getRandomName();
            String prenom = getRandomPrenom();
            float note = random.nextFloat(20);

            // hadi bah nhazo 2 number mora fasila
            DecimalFormat df = new DecimalFormat("#.##");
            note = Float.parseFloat(df.format(note));

            etudiant[i] = new Etudiant(name, prenom, note);
        }

        // ndiro copy l tablou etudiant bah nratbo fih
        Etudiant[] etudiantTri = Arrays.copyOf(etudiant, etudiant.length);

        TableauRecursif tab = new TableauRecursif(etudiant, etudiantTri);

        tab.triBulle(etudiantTri, 0, 0);

        // tab.triSelection();
        //tab.triInsertion(etudiantTri, 1, 1);
        
        tab.afficher(etudiant);
        tab.afficherTrie(etudiantTri);
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
    
}

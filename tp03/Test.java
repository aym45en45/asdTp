
/* 
 * 2 method triSelection() triInsertion() fi class Test wfi class Tableau w method Recherche Sequentielle
 * dartlhm comment bah mtb9ach method takhdm brk mdam kayn whda khlf tkhdm nfs khdma sama rahm ymcho nrml
 *
 *
 * qst 4
 * le temps d’exécution de triBulle 
 * N=10 :  2.681s
 * N=10^2 : 2.78s
 * N=10^3 : 2.889s
 * N=10^4 : 5.267s
 * N=10^5 : 116.404s
 * le temps d’exécution de triSelection
 * N=10 : 2.421s
 * N=10^2 : 2.812s
 * N=10^3 : 3.307s
 * N=10^4 : 4.429s
 * N=10^5 : 29.047s
 * le temps d’exécution de triInsertion
 * N=10 : 2.869s
 * N=10^2 : 2.535s
 * N=10^3 : 2.721s
 * N=10^4 : 3.558s
 * N=10^5 : 43.47s
 */
import java.text.DecimalFormat;
import java.util.Arrays;
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

        TableauIteratif tab = new TableauIteratif(etudiant, etudiantTri);

        tab.triBulle();

        // tab.triSelection();
        // tab.triInsertion();

        tab.afficher(etudiant);
        tab.afficherTrie(etudiantTri);

        /*
         * //Recherche Sequentielle
         * 
         * if (RechercheSequentielle(etudiant, etudiant[6].note))
         * System.out.println("using Recherche Sequentielle the note " +
         * etudiant[6].note + " exst");
         * else
         * System.out.println("using Recherche Sequentielle the note " +
         * etudiant[6].note + " not exst");
         * 
         */

        // Recherche Dichotomique
        if (RechercheDichotomique(etudiantTri, etudiant[6].note))
            System.out.println("using Recherche Dichotomique the note " + etudiant[6].note + " exst");
        else
            System.out.println("using Recherche Dichotomique the note " + etudiant[6].note + " not exst");

        // la Affiche les étudiants (nom et prénom) qui ont obtenu un score d'examen
        // supérieur à 15
        AffichezSupEtudiants(etudiantTri);
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
        for (int i = 0; i < etudiantTri.length; i++) {
            if (etudiantTri[i].note == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean RechercheDichotomique(Etudiant[] etudiantTri, float value) {
        boolean found = false;
        int start = 0;
        int end = etudiantTri.length - 1;

        while (start <= end && !found) {
            int middle = (start + end) / 2;
            if (etudiantTri[middle].note == value) {
                found = true;
            } else {
                if (value > etudiantTri[middle].note) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }

        return found;
    }

    public static void AffichezSupEtudiants(Etudiant[] etudiantTri) {
        for (int i = 0; i < etudiantTri.length && etudiantTri[i].note >= 15; i++) {
            System.out.println((i + 1) + ": Nom: " + etudiantTri[i].name + ", Prénom: " + etudiantTri[i].prenom
                    + ", note : " + etudiantTri[i].note);
        }
    }
}

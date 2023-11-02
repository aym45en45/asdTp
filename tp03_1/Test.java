import java.text.DecimalFormat;
import java.util.Random;

public class Test {
    private static final int N = 10;
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {

        Etudiant[] etudiant = new Etudiant[N];
        Etudiant[] etudiantTri = new Etudiant[N];
        for (int i = 0; i < N; i++) {
            Random random = new Random();
            String name = getRandomName();
            String prenom = getRandomPrenom();
            float note = random.nextFloat(20);

            DecimalFormat df = new DecimalFormat("#.##");// thaz 2 number mora fasila
            note = Float.parseFloat(df.format(note));

            etudiant[i] = new Etudiant(name, prenom, note);
        }
        TableauIteratif tab = new TableauIteratif(etudiant, etudiantTri);
        tab.afficher(etudiant);
        tab.afficherTrie(etudiant);
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

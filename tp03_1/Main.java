import java.util.Random;

public class Main {
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {

        Etudiant[] etudiant = new Etudiant[5];
        Etudiant[] etudiantTri = new Etudiant[5];
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            String name = getRandomName();
            String prenom = getRandomPrenom();
            float note = random.nextFloat(20);

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

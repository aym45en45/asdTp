import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter Etudiant name");
        String name = scn.next();
        System.out.println("enter Etudiant note");
        float note = scn.nextFloat();
        System.out.println("enter Etudiant grp");
        int grp = scn.nextInt();
        Etudiant e1 = new Etudiant(name, note, grp);

        System.out.println("enter 2nd Etudiant name");
        String name2 = scn.next();
        System.out.println("enter 2nd Etudiant note");
        float note2 = scn.nextFloat();
        System.out.println("enter 2nd Etudiant grp");
        int grp2 = scn.nextInt();
        Etudiant e2 = new Etudiant(name2, note2, grp2);
        Etudiant e = new Etudiant("a", 0, 0);
        
        Traitement traitement = new Traitement();
        traitement.comparer(e1, e2, e);
        System.out.println("l'étudiant(e) avec la meilleure est : "+e.nom);

        boolean res = false;
        traitement.admis(e, res);
        if (res)         
            System.out.println("l'étudiant(e) note est : supérieure ou égale à 10");
        else
            System.out.println("l'étudiant(e) note est : inf 10");
        
        if (traitement.memegroupe(e1, e2))         
            System.out.println("les deux étudiant(e)s appartiennent au même groupe");
        else
            System.out.println("les deux étudiant(e)s appartiennent pas au même groupe");

        

    
    }
}

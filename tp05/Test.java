import java.util.Scanner;

public class Test {
        public static Liste creationListe(Liste L){
            Scanner scr = new Scanner(System.in); 
            L.listeVide();
            for(int i=0;i<N-1;i++){
               int id = scr.nextInt();
               Element e = new Element(id);
                L.inserer(L, i,e );
            }
            return L;
        }

        public static void affichageListe(Liste L){
            for (int i = 0; i < L.longueur_iter(L); i++){
                System.out.println(L.acces(L, i).getid());
               // L.supprimer(L, 1);
            }
        }

}

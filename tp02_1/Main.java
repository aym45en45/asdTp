import java.util.Scanner;

public class Main {
    public static int[] Lecture(int[] T) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez ls value de tablou : ");
        for (int i = 0; i < T.length; i++) {
            System.out.print((i+1) + ": ");
            T[i] = scanner.nextInt();
        }
        return T;

    }

    public static int Recherche(int[] T, int N, int V) {
        if (N == T.length)
            return -1;
        if (T[N] == V)
            return N;
        return Recherche(T, N + 1, V);
    }

    public static int[] Suppression(int[] T, int V) {
        int Recherche =Recherche(T, 0, V);
        if (Recherche == -1)
            return T;
        int[] tableau = new int[T.length - 1];
        for (int i = 0; i < tableau.length; i++) {
            if (Recherche > i)
                tableau[i] = T[i];
            else
                tableau[i] = T[i + 1];
        }

        return tableau;
    }

    public static void Affichage(int[] T) {
        System.out.println("------------------\ntablou after remove elemnt 5:");
        for (int i = 0; i < T.length; i++) {
            System.out.println((i+1) + ": " + T[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] T = new int[10];
        Affichage(Suppression(Lecture(T),5));
    }
}

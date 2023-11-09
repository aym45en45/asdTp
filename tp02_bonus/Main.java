import java.util.Scanner;

public class Main {
    public static float Maximum(int[] T, int N) {
        if (N == 1) {
            return T[0];
        } else {
            float max = Maximum(T, N - 1);
            if (T[N - 1] > max) {
                return T[N - 1];
            } else {
                return max;
            }
        }
    }

    public static int[] Lecture(int[] T) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la valeur de tablou : ");
        for (int i = 0; i < T.length; i++) {
            System.out.print(i + ": ");
            T[i] = scanner.nextInt();
        }
        return T;

    }

    public static void main(String[] args) {
        int[] tableau = new int[10];
        System.out.println("Le maximum du tableau est : " + Maximum(Lecture(tableau), 10));
    }
}

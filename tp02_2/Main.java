import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("entre number M :");
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        int co = 0;
        int i = 2;
        while (co < M) {
            if (Premier(i)) {
                System.out.println(i);
                co++;
            }
            i++;
        }
    }

    /*
      this loop for qst 1
      public static boolean Premier(int N) {
      for (int i = 2; i <= N / 2; i++) {
      if (N % i == 0)
      return false;
      }
      return true;
      }
     */
    public static boolean Premier(int N) {
        if (NbreDiviseurs(N, 1) == 2)
            return true;
        else
            return false;
    }

    public static int NbreDiviseurs(int A, int B) {
        if (A == B)
            return 1;
        else {
            if (A % B == 0)
                return NbreDiviseurs(A, B + 1) + 1;
            else
                return NbreDiviseurs(A, B + 1);
        }
    }
}
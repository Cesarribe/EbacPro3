package Dinamica;

import java.util.Scanner;

public class Tarefa {

    // exercicio 1


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Adicione um número inteiro: ");
            int num = input.nextInt();
            int[] fatorial = new int[num + 1];

            fatorial[0] = 1; // Por definição, o fatorial de 0 é 1

            for (int i = 1; i <= num; i++) {
                fatorial[i] = fatorial[i - 1] * i;
            }

            System.out.println("Fatorial de " + num + " é " + fatorial[num]);
        }


        // exercicio 2


    public class Fatorial {

        // top-down
        public static int calcFatorTopDown(int n, int[] memo) {
            if (n <= 1)
                return 1;
            if (memo[n] != 0)
                return memo[n];
            memo[n] = n * calcFatorTopDown(n - 1, memo);
            return memo[n];
        }

        // bottom-up
        public static int calcFatorBottomUp(int n) {
            int[] memo = new int[n + 1];
            memo[0] = 1;
            for (int i = 1; i <= n; i++) {
                memo[i] = i * memo[i - 1];
            }
            return memo[n];
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int n = scan.nextInt();

            // Usando top down
            int[] memoTopDown = new int[n + 1];
            System.out.print("Top-Down: " + calcFatorTopDown(n, memoTopDown));

            System.out.print(" ");

            // Usando bottom up
            System.out.print("Bottom-Up: " + calcFatorBottomUp(n));

            scan.close();
        }
    }

}



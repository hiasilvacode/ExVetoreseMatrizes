import java.util.Scanner;

public class Doismatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] produto = new int[2][2];


        System.out.println("Digite os elementos da matriz A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Digite os elementos da matriz B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }


        System.out.println("Produto das matrizes A e B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
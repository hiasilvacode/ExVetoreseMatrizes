import java.util.Scanner;

public class Novematriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[][] matriz = new int[3][3];


        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        boolean isIdentidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j && matriz[i][j] != 1) {
                    isIdentidade = false;
                    break;
                }
                if (i != j && matriz[i][j] != 0) {
                    isIdentidade = false;
                    break;
                }
            }
            if (!isIdentidade) {
                break;
            }
        }


        if (isIdentidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }

        scanner.close();
    }
}
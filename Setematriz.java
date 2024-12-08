import java.util.Scanner;

public class Setematriz {
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


        int produto = 1;
        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][2 - i];
        }


        System.out.println("Produto dos elementos da diagonal secundária: " + produto);


        scanner.close();
    }
}
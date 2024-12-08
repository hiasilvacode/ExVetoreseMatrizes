import java.util.Scanner;

public class Ummatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 4 * 4;


        System.out.println("Digite os 16 números inteiros para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }


        double media = (double) soma / totalElementos;


        System.out.printf("A média aritmética dos elementos da matriz é:", media);
        scanner.close();
    }
}
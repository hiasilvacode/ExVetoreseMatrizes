import java.util.Scanner;

public class Quatromatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[][] matriz = new int[3][3];
        int menorValor;


        System.out.println("Digite os 9 números inteiros para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        menorValor = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }


        System.out.println("O menor valor da matriz é: " + menorValor);


        scanner.close();
    }
}

import java.util.Scanner;

public class Seisvetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        System.out.println("Os números em ordem crescente são:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Setevetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];
        int contadorPositivos = 0;


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }


        System.out.println("A quantidade de números positivos é: " + contadorPositivos);

        scanner.close();
    }
}
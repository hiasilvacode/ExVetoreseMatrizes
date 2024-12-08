import java.util.Scanner;

public class Tresvetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[7];
        int soma = 0;


        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }


        double media = (double) soma / numeros.length;


        System.out.printf("A média aritmética dos números é: ", media);

        scanner.close();
    }
}
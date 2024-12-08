import java.util.Scanner;

public class Doisvetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];
        int soma = 0;


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }


        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
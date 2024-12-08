import java.util.Scanner;

public class Cincovetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[5];


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        int maior = numeros[0];
        int menor = numeros[0];


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
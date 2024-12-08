import java.util.Scanner;

public class QuatroVetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[5];
        int contadorPares = 0;


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();


            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }


        System.out.println("A quantidade de números pares é: " + contadorPares);
        scanner.close();
    }
}
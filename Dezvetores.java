import java.util.Scanner;

public class Dezvetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[5];
        boolean encontradoZero = false;


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();


            if (numeros[i] == 0) {
                encontradoZero = true;
            }
        }


        if (encontradoZero) {
            System.out.println("Pelo menos um número é igual a zero.");
        } else {
            System.out.println("Nenhum número é igual a zero.");
        }

        scanner.close();
    }
}
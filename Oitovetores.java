import java.util.Scanner;

public class Oitovetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0;
        int contadorPares = 0, contadorImpares = 0;


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();


            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contadorPares++;
            } else {
                somaImpares += numeros[i];
                contadorImpares++;
            }
        }


        double mediaPares = (contadorPares > 0) ? (double) somaPares / contadorPares : 0;
        double mediaImpares = (contadorImpares > 0) ? (double) somaImpares / contadorImpares : 0;

        System.out.printf("A média dos números pares é: ", mediaPares);
        System.out.printf("A média dos números ímpares é: ", mediaImpares);


        scanner.close();
    }
}
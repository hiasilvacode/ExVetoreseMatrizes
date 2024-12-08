
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        System.out.println("A soma é" + (num1 + num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A divisão é: " + (num2 / num1));
        System.out.println("A multiplicação é: " + (num1 * num2));

    }
}
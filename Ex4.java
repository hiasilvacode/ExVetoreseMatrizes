import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota : ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota : ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);


            System.out.printf("A média ponderada é: %.2f%n", media);
        }


    }

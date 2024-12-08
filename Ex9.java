import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor : ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros : ");
        double taxaJuros = scanner.nextDouble();



        double montante = 0;

        for (int i = 1; i <= 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJuros);
        }


        System.out.printf("O montante acumulado após 12 meses é:", montante);


        scanner.close();
    }
}
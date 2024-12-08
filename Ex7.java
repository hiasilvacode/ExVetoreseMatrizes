import java.util.Scanner;
public class Ex7{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o salário: ");
        double salarioBase = scanner.nextDouble();


        double comissao = salarioBase * 0.05;


        double salarioLiquido = salarioBase + comissao;


        System.out.printf("Salário Base: ", salarioBase);
        System.out.printf("Comissão (5%%): ", comissao);
        System.out.printf("Salário Líquido: ", salarioLiquido);


        scanner.close();
    }
}

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int Num = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int Num2 = scanner.nextInt();


        System.out.println("Antes da troca:");
        System.out.println("Primeiro número: " + Num);
        System.out.println("Segundo número: " + Num2);


        int temp = Num;
        Num = Num2;
        Num2 = temp;


        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + Num);
        System.out.println("Segundo número: " + Num2);
        scanner.close();
    }
}
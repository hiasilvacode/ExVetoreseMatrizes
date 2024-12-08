import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade profuto ");
        int quantidade = scanner.nextInt();


        double total = precoproduto * quantidade;


        if (quantidade > 10) {
            total = total * 0.9;
        }


        System.out.printf("O valor total a ser pago é: ", total);

        scanner.close();
    }
}
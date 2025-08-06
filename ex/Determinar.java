// EXERCICIO 1: Maior, menor, produto e média de 3 números
import java.util.Scanner;
public class Determinar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        c = scanner.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));
        int produto = a * b * c;
        double media = (a + b + c) / 3.0;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Produto: " + produto);
        System.out.println("Media: " + media);

        scanner.close();
    }
}











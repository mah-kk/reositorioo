import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int c = scanner.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));
        
        int produto = a * b * c;
        double media = (a + b + c) / 3.0;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Produto: " + produto);
        System.out.println("Media: " + media);
    }
}


// EXERCICIO 2: Verifica se o primeiro número é múltiplo do segundo
import java.util.Scanner;
public class Multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (b != 0 && a % b == 0) {
            System.out.println(a + " é múltiplo de " + b);
        } else {
            System.out.println(a + " não é múltiplo de " + b);
        }

        sc.close();
    }
}
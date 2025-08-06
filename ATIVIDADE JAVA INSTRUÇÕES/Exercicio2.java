import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

    if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println(numero1 + " e multiplo de " + numero2);
        } else {
            System.out.println(numero1 + " nao e multiplo de " + numero2);
        }
    }
}


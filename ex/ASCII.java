// EXERCICIO 4: Caractere e código ASCII

import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char ch = scanner.next().charAt(0);

        int codigo = (int) ch;
        System.out.println("Caractere: " + ch + " | Codigo ASCII: " + codigo);

        scanner.close();
    }
}

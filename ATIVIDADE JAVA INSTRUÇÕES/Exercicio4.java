import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char c = scanner.next().charAt(0);
       int ascii = (int) c;

        System.out.println("Caractere: " + c + ", Codigo ASCII: " + ascii);
    }
}


import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[10][10];

    System.out.println("Digite os caracteres da matriz:");
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                matriz[i][j] = scanner.next().charAt(0);
                imprimirMatrizSemDiagonalSecundaria(matriz);
    }
    public static void imprimirMatrizSemDiagonalSecundaria(char[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j != 9)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
}

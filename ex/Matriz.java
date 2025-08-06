// EXERCICIO 6: Matriz 10x10 e imprimir sem diagonal secundária
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        char[][] matriz = new char[10][10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os caracteres da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.next().charAt(0);
            }
        }

        imprimirSemDiagonalSecundaria(matriz);
        sc.close();
    }

    public static void imprimirSemDiagonalSecundaria(char[][] m) {
        System.out.println("\nMatriz sem diagonal secundária:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j != m.length - 1) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

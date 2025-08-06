// EXERCICIO 5: Porcentagem de números menores que 8 e maiores que 10
import java.util.Scanner;
public class Porcentagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int menoresQue8 = 0, maioresQue10 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] < 8) menoresQue8++;
            if (numeros[i] > 10) maioresQue10++;
        }

        System.out.printf("%% menores que 8: %.2f%%\n", (menoresQue8 / 12.0) * 100);
        System.out.printf("%% maiores que 10: %.2f%%\n", (maioresQue10 / 12.0) * 100);

        sc.close();
    }
}
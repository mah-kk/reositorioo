
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[12];
        int menoresQue8 = 0;
        int maioresQue10 = 0;
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] < 8) menoresQue8++;
            if (numeros[i] > 10) maioresQue10++;
        }
       
       System.out.println("Porcentagem menores que 8: " + (menoresQue8 / 12.0 * 100) + "%");
        System.out.println("Porcentagem maiores que 10: " + (maioresQue10 / 12.0 * 100) + "%");
    }
}

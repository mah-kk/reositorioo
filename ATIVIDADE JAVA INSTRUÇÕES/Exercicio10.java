import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha: cara ou coroa: ");
        String escolha = scanner.next().toLowerCase();

        boolean resultado = simularJogada(escolha);
        System.out.println("Voce " + (resultado ? "ganhou!" : "perdeu!"));

        scanner.close();
    }

    public static boolean simularJogada(String escolha) {
        Random rand = new Random();  
        int chance = rand.nextInt(100);
        System.out.println("Numero aleatorio: " + chance);

        if (chance < 30) {
            return true; 
        } else {
            return false;
        }
    }
}

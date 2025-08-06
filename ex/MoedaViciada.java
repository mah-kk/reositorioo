// EXERCICIO 10: MoedaViciada com 30% de chance para o usuário
import java.util.Random;
import java.util.Scanner;

public class MoedaViciada {
    public static boolean jogar(String escolhaUsuario) {
        Random rand = new Random();
        int chance = rand.nextInt(100);

        return chance < 30;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha cara ou coroa: ");
        String escolha = sc.next().toLowerCase();

        boolean ganhou = jogar(escolha);
        if (ganhou) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }

        sc.close();
    }
}

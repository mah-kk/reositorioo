
// EXERCICIO 3: Diametro, area e circunferencia de um circulo
import java.util.Scanner;
public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        System.out.println("Diametro: " + 2 * raio);
        System.out.println("Area: " + Math.PI * raio * raio);
        System.out.println("Circunferencia: " + 2 * Math.PI * raio);

        sc.close();
    }
}

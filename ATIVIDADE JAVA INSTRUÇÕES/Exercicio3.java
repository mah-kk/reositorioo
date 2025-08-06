import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");

        double raio = scanner.nextDouble();
        
        double diametro = 2 * raio;
        double area = Math.PI * raio * raio;
        double circunferencia = 2 * Math.PI * raio;

        System.out.println("Diametro: " + diametro);
        System.out.println("Area: " + area);
        System.out.println("Circunferencia: " + circunferencia);
    }
}

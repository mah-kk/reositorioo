import java.util.Scanner;

class NotaFiscal {
    String numero;
    String descricao;
    int quantidade;
    double preco;

    public NotaFiscal(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getTotal() {
        return quantidade * preco;
    }

    public static double getTotalNota(NotaFiscal[] notas) {
        double total = 0;
        for (NotaFiscal n : notas) {
            total += n.getTotal();
        }
        return total;
    }
}

public class Fiscal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pecas deseja cadastrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        NotaFiscal[] notas = new NotaFiscal[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCadastro da peca: " + (i + 1));

            System.out.print("Numero da peca: ");
            String numero = scanner.nextLine();

            System.out.print("Descricao da peca: ");
            String descricao = scanner.nextLine();

            System.out.print("Quantidade comprada: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preco da peca: R$");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 

            notas[i] = new NotaFiscal(numero, descricao, quantidade, preco);
        }

        System.out.println("\n--- Detalhes da Nota Fiscal ---");
        for (NotaFiscal nota : notas) {
            System.out.println("Numero: " + nota.numero);
            System.out.println("Descricao: " + nota.descricao);
            System.out.println("Quantidade: " + nota.quantidade);
            System.out.println("Preco: R$" + nota.preco);
            System.out.println("Total da peca: R$" + nota.getTotal());
            System.out.println("-----------------------------");
        }

        System.out.println("Total da nota: R$" + NotaFiscal.getTotalNota(notas));
    }
}

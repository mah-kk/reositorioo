// EXERCICIO 7: Classe Conta com crédito, débito e getSaldo
class Conta {
    double saldoConta;

    public void credito(double valor) {
        saldoConta += valor;
    }

    public void debito(double valor) {
        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldoConta -= valor;
        }
    }

    public double getSaldo() {
        return saldoConta;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

      

        System.out.println("Saldo C1: R$" + c1.getSaldo());
        System.out.println("Saldo C2: R$" + c2.getSaldo());
    }
}
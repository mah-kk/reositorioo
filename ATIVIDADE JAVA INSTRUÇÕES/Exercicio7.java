class Conta {
    double saldoConta;
public void credito(double valor) {
        saldoConta += valor;
    }
public void debito(double valor) {
        if (valor <= saldoConta)
            saldoConta -= valor;
        else
            System.out.println("Saldo insuficiente para débito.");
    }
public double getSaldo() {
        return saldoConta;
    }
}
public class Exercicio7 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
conta1.credito(100);
        conta2.credito(200);
conta1.debito(30);
        conta2.debito(250); 
System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
    }
}

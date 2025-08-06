// EXERCICIO 9: Classe Data com impressão e dias acumulados
class Data {
    int dia, mes, ano;

    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public int diasAteMes(int mes) {
        int dias = 0;
        for (int i = 1; i < mes; i++) {
            dias += (i % 2 == 1) ? 31 : 30;
        }
        return dias;
    }
}

public class Acumulados {
    public static void main(String[] args) {
        Data d = new Data(10, 5, 2023);
        d.imprimirData();
        System.out.println("Dias ate o mes " + d.mes + ": " + d.diasAteMes(d.mes));
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atividade extends JFrame {
    private JTextField txtJuros;
    private JTextField txtAnos;
    private JTextField txtDeposito;
    private JTextField txtTotal;

    public Atividade() {
        setTitle("Poupex");
        setSize(300, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); 

        // Juros ao mês
        JLabel lblJuros = new JLabel("Juros ao mes %:");
        lblJuros.setBounds(10, 10, 120, 20);
        add(lblJuros);
        txtJuros = new JTextField();
        txtJuros.setBounds(150, 10, 100, 20);
        add(txtJuros);

        // Número de anos
        JLabel lblAnos = new JLabel("Numero de Anos:");
        lblAnos.setBounds(10, 40, 120, 20);
        add(lblAnos);
        txtAnos = new JTextField();
        txtAnos.setBounds(150, 40, 100, 20);
        add(txtAnos);

        // Depósito mensal
        JLabel lblDeposito = new JLabel("Deposito Mensal R$:");
        lblDeposito.setBounds(10, 70, 130, 20);
        add(lblDeposito);
        txtDeposito = new JTextField();
        txtDeposito.setBounds(150, 70, 100, 20);
        add(txtDeposito);

        // Total poupado
        JLabel lblTotal = new JLabel("Total Poupado R$:");
        lblTotal.setBounds(10, 100, 130, 20);
        add(lblTotal);
        txtTotal = new JTextField();
        txtTotal.setEditable(false); 
        txtTotal.setBounds(150, 100, 100, 20);
        add(txtTotal);

        // Botão calcular
        JButton btnCalcular = new JButton("OK");
        btnCalcular.setBounds(100, 140, 80, 25);
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });

        setVisible(true);
    }

    private void calcularTotal() {
        try {
            double jurostotal = Double.parseDouble(txtJuros.getText()) / 100.0;
            int anos = Integer.parseInt(txtAnos.getText());
            double deposito = Double.parseDouble(txtDeposito.getText());
            int meses = anos * 12;
            double total = 0.0;

            for (int i = 0; i < meses; i++) {
                total += deposito;
                total += total * jurostotal;
            }

            txtTotal.setText(String.format("R$ %.2f", total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verifique os campos digitados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Atividade();
    }
}

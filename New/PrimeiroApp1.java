import javax.swing.*;
import java.awt.*;
 
public class PrimeiroApp1{
   
    public static void main(String[] args){
       
        JFrame frame = new JFrame("Primeira janela");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
       panel.setLayout(new BorderLayout());
 
        JButton button = new JButton("Clique aqui para reber uma mensagem");
        button.setPreferredSize(new Dimension(200,50));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.PINK);
 
        JTextField textField = new JTextField(10); // adiciona area de texto
        textField.setFont(new Font("Serif", Font.BOLD, 18));
 
        JLabel label = new JLabel("Digite seu nome: ");
        label.setFont(new Font("Serif", Font.BOLD, 24));
 
        button.addActionListener(e -> { // e recebe o retorno do clique bo botão
            JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 1); // exibe dialogo: 0 erro. 1 informação, 2 alerta > textField.get pega a informação
        }); // adicionar um listenner no click do notão
 
        JTextArea textArea = new JTextArea("Area de texto");
 
        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // ADICIONA UM NOVO PAINEL
        formPanel.setBackground(Color.PINK);
        formPanel.add(label);
        formPanel.add(textField);
 
        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(button, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setLocationRelativeTo(null); //centralizar quando abre
        //panel.add(textArea, BorderLayout.NORTH); informar em que parte do layout deve aparecer
 
        frame.setVisible(true);
   
 
       
   }
}



    
      
       
    
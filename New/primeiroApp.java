import javax.swing.*; // bibliotecas ja possuem classes
import java.awt.*; // carega todas as bibliotecas
 
public class primeiroApp{
   
    public static void main(String[] args){
       
        JFrame frame = new JFrame("Primeira janela"); // criando o objeto janela principal
        frame.setSize(400,300); // função para passar altura e largura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha o programa ao fechar a janela
 
        JPanel panel = new JPanel(); // criar objeto painel
        panel.setBackground(Color.PINK); // dar cor ao painel
 
        JButton button = new JButton("Clique"); // criar um botão e dar texto
        button.setPreferredSize(new Dimension(200,50)); // alterar tamanho do botão
        button.setBackground(Color.WHITE); // dar cor ao botao
        button.setForeground(Color.PINK); // dar cor ao texto do botao
 
        JLabel label = new JLabel("Digite seu nome: "); // adicionar texto
        label.setFont(new Font("Serif", Font.BOLD, 36)); // ALTERAR FONTE E TAMANHO
 
        JTextArea textArea = new JTextArea("Area de texto"); // adicionar area de texto
 
        panel.add(label);
        panel.add(button); // PRIMEIRO adicionar botão ao painel
        panel.add(textArea);
        frame.add(panel ); // DEPOIS adicionar componente/panel dentro do frame
 
        frame.setVisible(true); // função para tornar visivel SEMPRE POR ULTIMO
   
        //JOptionPane.showMessageDialog(null,"Mensagem", "Titulo", 2); // exibe dialogo 0 erro. 1 informação, 2 alerta
 
       
   }
}
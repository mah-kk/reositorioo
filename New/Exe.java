import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
public class Exe{
    public static void main(String[] args){
 
        //componente JFrame
        JFrame miJframe = new JFrame("Exemplo - Java Swing");
        miJframe.setSize(500,300);
 
        //componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300,300);
 
        //centralizar componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());
 
        //componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Diga-me a sua opiniao sobre java Swing: ");
 
        //componentes JTestArea
        JTextArea miJTextArea = new JTextArea(5,20);
 
        // conecta os componentes JLabel e JTextField em JPanel
        miJPanel.add(miJLabel); miJPanel.add(miJTextArea);
 
        //conecta JPanel a JFrame
        miJframe.add(miJPanel);
 
        // tornar visivel JFrame
        miJframe.setVisible(true);
 
 
    }
}
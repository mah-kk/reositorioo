import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakeQuizSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MakeQuizSwing().criarInterface());
    }

    private void criarInterface() {
        JFrame frame = new JFrame("✨ Qual maquiagem combina com você?");
        frame.setSize(600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBackground(new Color(255, 240, 250)); 

        JLabel titulo = new JLabel("💄 Qual maquiagem combina com você?");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setForeground(new Color(214, 51, 132));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        painelPrincipal.add(titulo);

        JPanel q2Panel = new JPanel();
        q2Panel.setBackground(painelPrincipal.getBackground());
        q2Panel.setBorder(BorderFactory.createTitledBorder("🌈 Qual sua vibe hoje?"));
        q2Panel.setLayout(new GridLayout(2, 2, 10, 10));

        ButtonGroup grupoQ2 = new ButtonGroup();
        JRadioButton q2A = new JRadioButton("Y2K");
        JRadioButton q2B = new JRadioButton("Brilhos");
        JRadioButton q2C = new JRadioButton("Pérolas");
        JRadioButton q2D = new JRadioButton("Rosa");

        Font opFont = new Font("SansSerif", Font.PLAIN, 16);
        q2A.setFont(opFont); q2B.setFont(opFont); q2C.setFont(opFont); q2D.setFont(opFont);
        q2A.setBackground(painelPrincipal.getBackground());
        q2B.setBackground(painelPrincipal.getBackground());
        q2C.setBackground(painelPrincipal.getBackground());
        q2D.setBackground(painelPrincipal.getBackground());

        grupoQ2.add(q2A); grupoQ2.add(q2B); grupoQ2.add(q2C); grupoQ2.add(q2D);
        q2Panel.add(q2A); q2Panel.add(q2B); q2Panel.add(q2C); q2Panel.add(q2D);
        painelPrincipal.add(q2Panel);

        JLabel resultadoTexto = new JLabel(" ");
        resultadoTexto.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoTexto.setFont(new Font("SansSerif", Font.BOLD, 18));
        resultadoTexto.setForeground(new Color(128, 0, 128));
        resultadoTexto.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel imagemResultado = new JLabel();
        imagemResultado.setHorizontalAlignment(SwingConstants.CENTER);
        imagemResultado.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        JButton botao = new JButton("✨ Ver minha make!");
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setBackground(new Color(255, 182, 193));
        botao.setFocusPainted(false);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        botao.addActionListener(e -> {
            if (!q2A.isSelected() && !q2B.isSelected() && !q2C.isSelected() && !q2D.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Responda todas as perguntas!");
                return;
            }

            String mensagem = "";
            String caminhoImagem = "";

            if (q2A.isSelected()) {
                mensagem = "Seu estilo é moderno! ";
                caminhoImagem = "download (2).jfif"; 
            } else if (q2B.isSelected()) {
                mensagem = "Seu estilo é artístico! ";
                caminhoImagem = "download (3).jfif";
            } else if (q2C.isSelected()) {
                mensagem = "Seu estilo é ousado! ";
                caminhoImagem = "Close Up Portrait Photography_ Capture Strong Moments with Precision in 2024 38.jfif";
            } else if (q2D.isSelected()) {
                mensagem = "Seu estilo é fofo e brilhante! ";
                caminhoImagem = "download.jfif";
            }

            resultadoTexto.setText(mensagem);
            try {
                ImageIcon imagem = new ImageIcon(caminhoImagem);
                Image imgRedimensionada = imagem.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imagemResultado.setIcon(new ImageIcon(imgRedimensionada));
            } catch (Exception ex) {
                imagemResultado.setText("Imagem não encontrada.");
            }
        });

        painelPrincipal.add(Box.createVerticalStrut(10));
        painelPrincipal.add(botao);
        painelPrincipal.add(resultadoTexto);
        painelPrincipal.add(imagemResultado);

        frame.add(painelPrincipal, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

JButton botao = new JButton();

// Texto no botão
botao.setText("Clique aqui!");

// Cor do texto
botao.setForeground(Color.WHITE);

// Cor de fundo
botao.setBackground(Color.PINK);

// Fonte (nome, estilo, tamanho)
botao.setFont(new Font("Serif", Font.BOLD, 18));

// Ícone no botão (exige imagem no projeto)
botao.setIcon(new ImageIcon("icone.png"));

// Dica ao passar o mouse
botao.setToolTipText("Clique para fazer algo");

// Tamanho fixo (largura x altura)
botao.setPreferredSize(new Dimension(150, 50));

// Ativar ou desativar
botao.setEnabled(true); // ou false

// Visibilidade
botao.setVisible(true); // ou false

// Fundo opaco (importante para mostrar cor de fundo)
botao.setOpaque(true);

// Borda visível ou não
botao.setBorderPainted(false);

//Para aplicar tudo corretamente, adicione seu botão a um painel com layout adequado, por exemplo:
JPanel painel = new JPanel();
painel.add(botao);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;              // Importa os componentes gráficos do Swing
import java.awt.*;                // Importa as classes de layout e fontes

public class ExemploFontesSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Fontes"); // Cria a janela principal com título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o app ao clicar no X
        frame.setSize(400, 300); // Define tamanho da janela (largura, altura)

        JPanel painel = new JPanel(); // Cria um painel para agrupar os elementos
        painel.setLayout(new GridLayout(4, 1)); // Define layout em grade com 4 linhas e 1 coluna

        JLabel label1 = new JLabel("Título Principal"); // Cria um rótulo (label) com texto
        label1.setFont(new Font("Serif", Font.BOLD, 36)); // Fonte com serifa, negrito, tamanho 36

        JLabel label2 = new JLabel("Subtítulo em itálico"); // Novo rótulo
        label2.setFont(new Font("SansSerif", Font.ITALIC, 18)); // Fonte sem serifa, itálico, tamanho 18

        JLabel label3 = new JLabel("Texto com fonte divertida"); // Outro rótulo
        label3.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // Fonte Comic Sans (se instalada), negrito, tamanho 24

        JLabel label4 = new JLabel("Pequeno rodapé"); // Último rótulo
        label4.setFont(new Font("Serif", Font.PLAIN, 12)); // Fonte com serifa, estilo normal (PLAIN), tamanho 12

        painel.add(label1); // Adiciona o primeiro rótulo ao painel
        painel.add(label2); // Adiciona o segundo rótulo
        painel.add(label3); // Adiciona o terceiro rótulo
        painel.add(label4); // Adiciona o quarto rótulo

        frame.add(painel); // Adiciona o painel à janela principal
        frame.setVisible(true); // Exibe a janela
    }
}


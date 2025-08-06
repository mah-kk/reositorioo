import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class PhotoManager extends JFrame {
    private JPanel photoPanel;

    public PhotoManager() {
        setTitle("PhotoManager ");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Botão para importar
        JButton importButton = new JButton(" Importar Fotos");
        importButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                importarFotos();
            }
        });

        // Painel para mostrar imagens
        photoPanel = new JPanel();
        photoPanel.setLayout(new FlowLayout());

        JScrollPane scrollPane = new JScrollPane(photoPanel);
        scrollPane.setPreferredSize(new Dimension(760, 500));

        // Layout principal
        JPanel topPanel = new JPanel();
        topPanel.add(importButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void importarFotos() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            mostrarMiniaturas(files);
        }
    }

    private void mostrarMiniaturas(File[] files) {
        photoPanel.removeAll(); // limpa anteriores

        for (File file : files) {
            try {
                BufferedImage img = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                JLabel label = new JLabel(icon);
                label.setToolTipText(file.getName());
                photoPanel.add(label);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        photoPanel.revalidate();
        photoPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PhotoManager().setVisible(true);
        });
    }
}

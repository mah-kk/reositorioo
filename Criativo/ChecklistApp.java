import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ChecklistApp extends JFrame {
    private JTextField taskField;
    private JButton addButton, removeButton;
    private JPanel taskPanel;
    private ArrayList<JCheckBox> tasks;

    public ChecklistApp() {
        setTitle(" Checklist de Tarefas");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tasks = new ArrayList<>();

        Color rosaClaro = new Color(255, 228, 240);
        Color rosaMedio = new Color(255, 182, 193);
        Color rosaBotao = new Color(255, 105, 180);
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 14);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(rosaClaro);

        taskField = new JTextField();
        taskField.setFont(fonte);
        taskField.setBackground(Color.white);
        taskField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        addButton = new JButton("Adicionar");
        addButton.setBackground(rosaBotao);
        addButton.setForeground(Color.white);
        addButton.setFocusPainted(false);
        addButton.setFont(fonte);

        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        taskPanel.setBackground(Color.white);

        JScrollPane scrollPane = new JScrollPane(taskPanel);
        scrollPane.setBackground(Color.white);
        scrollPane.setBorder(BorderFactory.createLineBorder(rosaMedio));

        removeButton = new JButton("Remover Selecionadas");
        removeButton.setBackground(rosaBotao);
        removeButton.setForeground(Color.white);
        removeButton.setFocusPainted(false);
        removeButton.setFont(fonte);

        addButton.addActionListener(e -> addTask());
        removeButton.addActionListener(e -> removeSelectedTasks());

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(removeButton, BorderLayout.SOUTH);

        getContentPane().setBackground(rosaClaro);
    }

    private void addTask() {
        String text = taskField.getText().trim();
        if (!text.isEmpty()) {
            JCheckBox task = new JCheckBox(text);
            task.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            task.setBackground(Color.white);
            tasks.add(task);
            taskPanel.add(task);
            taskPanel.revalidate();
            taskPanel.repaint();
            taskField.setText("");
        }
    }

    private void removeSelectedTasks() {
        tasks.removeIf(task -> {
            if (task.isSelected()) {
                taskPanel.remove(task);
                return true;
            }
            return false;
        });
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChecklistApp().setVisible(true);
        });
    }
}

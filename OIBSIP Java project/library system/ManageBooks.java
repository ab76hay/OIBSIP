import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ManageBooks extends JFrame {
    private ArrayList<String> books = new ArrayList<>();
    private DefaultListModel<String> listModel;
    private JList<String> bookList;
    private JTextField bookNameField;

    public ManageBooks() {
        setTitle("Manage Books");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("📚 Manage Books", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Center list
        listModel = new DefaultListModel<>();
        bookList = new JList<>(listModel);
        add(new JScrollPane(bookList), BorderLayout.CENTER);

        // Bottom panel (add/remove)
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3, 5, 5));

        bookNameField = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton deleteBtn = new JButton("Delete");

        bottomPanel.add(bookNameField);
        bottomPanel.add(addBtn);
        bottomPanel.add(deleteBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        // Action listeners
        addBtn.addActionListener(e -> {
            String name = bookNameField.getText().trim();
            if (!name.isEmpty()) {
                listModel.addElement(name);
                bookNameField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Enter book name first!");
            }
        });

        deleteBtn.addActionListener(e -> {
            int selectedIndex = bookList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Select a book to delete!");
            }
        });

        setVisible(true);
    }
}

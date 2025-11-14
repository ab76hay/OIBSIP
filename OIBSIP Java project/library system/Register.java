import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Register extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Register() {
        setTitle("Library - Register");
        setSize(320, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        setLayout(null);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(20, 20, 80, 25);
        add(lblUser);

        usernameField = new JTextField();
        usernameField.setBounds(110, 20, 170, 25);
        add(usernameField);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(20, 60, 80, 25);
        add(lblPass);

        passwordField = new JPasswordField();
        passwordField.setBounds(110, 60, 170, 25);
        add(passwordField);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(100, 110, 120, 30);
        add(btnRegister);

        btnRegister.addActionListener(e -> doRegister());
    }

    private void doRegister() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields.");
            return;
        }

        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registered successfully. You can login now.");
            this.dispose();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { // duplicate
                JOptionPane.showMessageDialog(this, "Username already exists.");
            } else {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "DB Error: " + ex.getMessage());
            }
        }
    }
}

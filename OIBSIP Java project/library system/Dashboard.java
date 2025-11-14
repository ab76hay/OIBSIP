import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Digital Library Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JLabel title = new JLabel("Welcome to Digital Library", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title);

        JButton booksBtn = new JButton("📚 Manage Books");
        JButton membersBtn = new JButton("👥 Manage Members");
        JButton logoutBtn = new JButton("🚪 Logout");

        add(booksBtn);
        add(membersBtn);
        add(logoutBtn);

        // ✅ Manage Books button action
        booksBtn.addActionListener(e -> {
            new ManageBooks(); // Opens ManageBooks window
        });

        // 👥 Manage Members (still placeholder)
        membersBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Manage Members page coming soon!");
        });

        // 🚪 Logout
        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginFrame(); // back to login
        });

        setVisible(true);
    }
}

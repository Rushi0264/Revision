import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // Components
    private Container container;
    private JLabel userLabel, passLabel, msgLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton, clearButton;

    // Constructor
    public LoginForm() {
        setTitle("Login Form");
        setSize(400, 250);
        setLocationRelativeTo(null); // Center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        // Username label & text field
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        container.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);
        container.add(userText);

        // Password label & text field
        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        container.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);
        container.add(passText);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(50, 150, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        // Clear button
        clearButton = new JButton("Clear");
        clearButton.setBounds(200, 150, 100, 30);
        clearButton.addActionListener(this);
        container.add(clearButton);

        // Message label
        msgLabel = new JLabel("");
        msgLabel.setBounds(50, 190, 300, 30);
        msgLabel.setForeground(Color.RED);
        container.add(msgLabel);

        setVisible(true);
    }

    // Handle button actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = new String(passText.getPassword());

            // Example check (real apps check DB)
            if (username.equals("admin") && password.equals("1234")) {
                msgLabel.setForeground(Color.GREEN);
                msgLabel.setText("Login Successful!");
            } else {
                msgLabel.setForeground(Color.RED);
                msgLabel.setText("Invalid username or password!");
            }
        } else if (e.getSource() == clearButton) {
            userText.setText("");
            passText.setText("");
            msgLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

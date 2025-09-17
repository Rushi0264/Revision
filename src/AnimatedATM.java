import javax.swing.*;
import java.awt.*;

public class AnimatedATM extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    // Step 1 Components
    private JTextField nameField, accountField;
    private JPasswordField pinField;

    // Step 2 Components
    private JLabel welcomeLabel, balanceLabel;
    private JTextField withdrawField, depositField;
    private JTextArea statusArea;

    // Logic variables
    private int correctPin = 12345;
    private int attempts = 0, maxAttempts = 3;
    private int accountBalance = 3000;
    private String userName, accountNumber;

    public AnimatedATM() {
        setTitle("Animated ATM");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createLoginPanel(), "Login");
        mainPanel.add(createBankingPanel(), "Banking");

        add(mainPanel);
        setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new GradientPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Welcome to ATM");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBounds(150, 40, 300, 40);
        panel.add(title);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(80, 120, 100, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 120, 200, 30);
        panel.add(nameField);

        JLabel accountLabel = new JLabel("Account No:");
        accountLabel.setForeground(Color.WHITE);
        accountLabel.setBounds(80, 170, 100, 30);
        panel.add(accountLabel);

        accountField = new JTextField();
        accountField.setBounds(200, 170, 200, 30);
        panel.add(accountField);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setForeground(Color.WHITE);
        pinLabel.setBounds(80, 220, 100, 30);
        panel.add(pinLabel);

        pinField = new JPasswordField();
        pinField.setBounds(200, 220, 200, 30);
        panel.add(pinField);

        JButton loginButton = createButton("Login");
        loginButton.setBounds(180, 300, 120, 40);
        loginButton.addActionListener(e -> verifyLogin());
        panel.add(loginButton);

        return panel;
    }

    private JPanel createBankingPanel() {
        JPanel panel = new GradientPanel();
        panel.setLayout(null);

        welcomeLabel = new JLabel();
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setBounds(50, 20, 400, 30);
        panel.add(welcomeLabel);

        balanceLabel = new JLabel();
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        balanceLabel.setForeground(Color.YELLOW);
        balanceLabel.setBounds(50, 60, 300, 30);
        panel.add(balanceLabel);

        JLabel withdrawLabel = new JLabel("Withdraw:");
        withdrawLabel.setForeground(Color.WHITE);
        withdrawLabel.setBounds(50, 120, 100, 30);
        panel.add(withdrawLabel);

        withdrawField = new JTextField();
        withdrawField.setBounds(150, 120, 100, 30);
        panel.add(withdrawField);

        JButton withdrawBtn = createButton("Withdraw");
        withdrawBtn.setBounds(270, 120, 120, 30);
        withdrawBtn.addActionListener(e -> withdrawMoney());
        panel.add(withdrawBtn);

        JLabel depositLabel = new JLabel("Deposit:");
        depositLabel.setForeground(Color.WHITE);
        depositLabel.setBounds(50, 170, 100, 30);
        panel.add(depositLabel);

        depositField = new JTextField();
        depositField.setBounds(150, 170, 100, 30);
        panel.add(depositField);

        JButton depositBtn = createButton("Deposit");
        depositBtn.setBounds(270, 170, 120, 30);
        depositBtn.addActionListener(e -> depositMoney());
        panel.add(depositBtn);

        statusArea = new JTextArea();
        statusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(statusArea);
        scrollPane.setBounds(50, 230, 350, 180);
        panel.add(scrollPane);

        return panel;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 140, 0));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setFont(new Font("Arial", Font.BOLD, 14));

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(220, 20, 60));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(255, 140, 0));
            }
        });

        return button;
    }

    private void verifyLogin() {
        userName = nameField.getText().trim();
        accountNumber = accountField.getText().trim();
        int pin = Integer.parseInt(new String(pinField.getPassword()));

        if (userName.isEmpty() || accountNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all details!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pin == correctPin) {
            welcomeLabel.setText("Welcome, " + userName + " | Account No: " + accountNumber);
            balanceLabel.setText("Balance: ₹" + accountBalance);
            cardLayout.show(mainPanel, "Banking");
        } else {
            attempts++;
            if (attempts >= maxAttempts) {
                JOptionPane.showMessageDialog(this, "Account locked for 48 hours!", "Blocked", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect PIN! Attempts left: " + (maxAttempts - attempts), "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void withdrawMoney() {
        try {
            int amount = Integer.parseInt(withdrawField.getText());
            if (amount > accountBalance) {
                addStatus("Insufficient balance!");
            } else {
                accountBalance -= amount;
                balanceLabel.setText("Balance: ₹" + accountBalance);
                addStatus("Withdrawn: ₹" + amount);
            }
        } catch (NumberFormatException e) {
            addStatus("Invalid withdraw amount!");
        }
    }

    private void depositMoney() {
        try {
            int amount = Integer.parseInt(depositField.getText());
            accountBalance += amount;
            balanceLabel.setText("Balance: ₹" + accountBalance);
            addStatus("Deposited: ₹" + amount);
        } catch (NumberFormatException e) {
            addStatus("Invalid deposit amount!");
        }
    }

    private void addStatus(String msg) {
        statusArea.append(msg + "\n");
    }

    // Gradient Panel
    class GradientPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            GradientPaint gp = new GradientPaint(0, 0, Color.PINK, getWidth(), getHeight(), Color.RED);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimatedATM::new);
    }
}

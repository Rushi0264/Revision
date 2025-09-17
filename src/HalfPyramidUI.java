import javax.swing.*;
import java.awt.*;

public class HalfPyramidUI extends JPanel {
    private int rowsPrinted = 0; // how many rows drawn so far

    public HalfPyramidUI() {
        setBackground(Color.BLACK); // background color

        // Timer for animation (prints row by row with delay)
        Timer timer = new Timer(500, e -> {
            rowsPrinted++;
            repaint();
            if (rowsPrinted >= 6) { // total rows
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int n = rowsPrinted; // print only current rows
        int xStart = 50, yStart = 50; // starting point

        // Define some colors for stars
        Color[] colors = {Color.RED, Color.GREEN, Color.YELLOW, Color.CYAN, Color.MAGENTA, Color.ORANGE};

        for (int i = 1; i <= n; i++) {
            int x = xStart;
            for (int j = 1; j <= i; j++) {
                g.setColor(colors[(int) (Math.random() * colors.length)]);
                g.drawString("*", x, yStart + i * 30); // draw star with spacing
                x += 30; // move horizontally
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colorful Half Pyramid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HalfPyramidUI());
        frame.setVisible(true);
    }
}

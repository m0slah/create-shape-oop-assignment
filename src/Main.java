import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        initUI();
    }

    private void initUI() {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(2, 1));

        container.add(new FirstShape());
        container.add(new SecondShape());

        add(container);

        setTitle("Shape Drawing");
        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}

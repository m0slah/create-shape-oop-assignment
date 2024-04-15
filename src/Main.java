import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        initUI();
    }

    private void initUI() {
        add(new FirstShape());

        setTitle("Shape Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        initUI();
    }

    private void initUI() {
        add(new FirstShape());
//        add(new SecondShape()); // uncomment this line two see the second Shape

        setTitle("Shape Drawing");
        setSize(400, 400);
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

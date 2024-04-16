import javax.swing.*;
import java.awt.*;

public class SecondShape extends JPanel {

    private static final int ROUND_RECT_WIDTH = 80;
    private static final int ROUND_RECT_HEIGHT = 80;
    private static final int ROUND_RECT_ARC_WIDTH = 100;
    private static final int ROUND_RECT_ARC_HEIGHT = 100;
    private static final int RECT_WIDTH = 80;
    private static final int RECT_HEIGHT = 40;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.blue);
        g.fillRoundRect(0, 0, ROUND_RECT_WIDTH, ROUND_RECT_HEIGHT, ROUND_RECT_ARC_WIDTH, ROUND_RECT_ARC_HEIGHT);
        g.fillRoundRect(160, 180, ROUND_RECT_WIDTH, ROUND_RECT_HEIGHT, ROUND_RECT_ARC_WIDTH, ROUND_RECT_ARC_HEIGHT);

        g.setColor(Color.red);
        fillTriangle(g, 60, 120, 110, 80, 160, 120);
        fillTriangle(g, 280, 360, 330, 310, 380, 360);

        g.setColor(Color.green);
        g.fillRect(130, 130, RECT_WIDTH, RECT_HEIGHT);
        g.fillRect(210, 270, RECT_WIDTH, RECT_HEIGHT);
    }

    private void fillTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};
        int nPoints = 3;

        g.fillPolygon(xPoints, yPoints, nPoints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SecondShape());
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

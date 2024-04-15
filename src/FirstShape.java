import javax.swing.*;
import java.awt.*;

public class FirstShape extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color for the triangle
        g.setColor(Color.BLACK);
        int[] xPoints = {150, 20, 280};
        int[] yPoints = {20, 280, 280};
        int nPoints = 3;
        g.fillPolygon(xPoints, yPoints, nPoints);

        // Draw and fill a circle
        g.setColor(Color.white);
        int circleX = 60, circleY = 80, circleWidth = 180, circleHeight = 180;
        g.fillArc(circleX, circleY, circleWidth, circleHeight, 0, 360);

        g.setColor(Color.black);
        g.drawArc(circleX, circleY, circleWidth, circleHeight, 0, 360);

        // Outline the triangle
        g.setColor(Color.WHITE);
        g.drawLine(150, 20, 20, 280);
        g.drawLine(20, 280, 280, 280);
        g.drawLine(280, 280, 150, 20);

        // Draw a rectangle inside the circle
        g.setColor(Color.black);
        int circleCenterX = circleX + circleWidth / 2;
        int circleCenterY = circleY + circleHeight / 2;
        int rectWidth = 130;
        int rectHeight = 130;
        int rectX = circleCenterX - rectWidth / 2;
        int rectY = circleCenterY - rectHeight / 2;
        g.fillRect(rectX, rectY, rectWidth, rectHeight);

        // Draw an inverted triangle inside the rectangle
        g.setColor(Color.WHITE);
        int padding = 20;
        int triBaseLength = rectWidth - 2 * padding;
        int triHeight = rectHeight - 2 * padding;
        int[] triX = {
                rectX + padding,
                rectX + rectWidth - padding,
                rectX + rectWidth / 2
        };
        int[] triY = {
                rectY + padding,
                rectY + padding,
                rectY + rectHeight - padding
        };
        g.fillPolygon(triX, triY, 3);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("first Shape Drawing");
            FirstShape panel = new FirstShape();
            frame.setContentPane(panel);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

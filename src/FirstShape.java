import javax.swing.*;
import java.awt.*;

public class FirstShape extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.cyan);
        int[] xPoints = {150, 20, 280};
        int[] yPoints = {20, 280, 280};
        int nPoints = 3;
        g.fillPolygon(xPoints, yPoints, nPoints);

        g.setColor(Color.yellow);
        int circleX = 60, circleY = 80, circleWidth = 180, circleHeight = 180;
        g.fillArc(circleX, circleY, circleWidth, circleHeight, 0, 360);

        g.setColor(Color.cyan);
        g.drawArc(circleX, circleY, circleWidth, circleHeight, 0, 360);

        g.setColor(Color.yellow);
        g.drawLine(150, 20, 20, 280);
        g.drawLine(20, 280, 280, 280);
        g.drawLine(280, 280, 150, 20);

        g.setColor(Color.cyan);
        int circleCenterX = circleX + circleWidth / 2;
        int circleCenterY = circleY + circleHeight / 2;
        int rectWidth = 130;
        int rectHeight = 130;
        int rectX = circleCenterX - rectWidth / 2;
        int rectY = circleCenterY - rectHeight / 2;
        g.fillRect(rectX, rectY, rectWidth, rectHeight);

        g.setColor(Color.yellow);
        int padding = 20;
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
}

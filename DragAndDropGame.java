import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DragAndDropGame extends JPanel {
    private Rectangle[] item = new Rectangle[4];
    private Rectangle[] target = new Rectangle[4];
    private int draggingItem;
    private boolean dragging = false;
    private int offsetX, offsetY;

    public DragAndDropGame() {
        for(int i=0;i<item.length;i++) {
            item[i] = new Rectangle(50, 50+(i*90), 50, 50);  // Draggable item
            target[i] = new Rectangle(200, 50+(i*90), 50, 50);  // Drop target
        }
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for(int i=0;i<item.length;i++)
                    if (item[i].contains(e.getPoint())) {
                    draggingItem = i;
                    dragging = true;
                    offsetX = e.getX() - item[i].x;
                    offsetY = e.getY() - item[i].y;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
                if (target[draggingItem].intersects(item[draggingItem])) {
                    System.out.println("Matched!");
                }
                else{
                   item[draggingItem].setLocation(50-((int)Math.round(0.9*(50-item[draggingItem].x))),50-((int)Math.round(0.9*(50-item[draggingItem].y))));
                   repaint();
                }
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    item[draggingItem].setLocation(e.getX() - offsetX, e.getY() - offsetY);
                    repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // Not needed
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for(int i=0;i<item.length;i++)
            g.fillRoundRect(item[i].x, item[i].y, item[i].width, item[i].height, 10, 10);  // Draw draggable item
        g.setColor(Color.BLUE);
        for(int i=0;i<target.length;i++)
            g.fillRoundRect(target[i].x, target[i].y, target[i].width, target[i].height,10,10);  // Draw drop target

        g.setColor(Color.black);
        g.drawString("text",item[0].x+15,item[0].y+30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drag and Drop Matching Game");
        frame.add(new DragAndDropGame());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

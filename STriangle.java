 import java.awt.Graphics;
 import java.awt.Point;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.JApplet;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JPanel;
 import javax.swing.JTextField;

 public class STriangle extends JApplet {
     private JTextField jtfOrder = new JTextField("0", 5);
     private STriangle.STrianglePanel trianglePanel = new STriangle.STrianglePanel();

     public STriangle() {
         JPanel panel = new JPanel();
         panel.add(new JLabel("Enter an order: "));
         panel.add(this.jtfOrder);
         this.jtfOrder.setHorizontalAlignment(4);
         this.add(this.trianglePanel);
         this.add(panel, "South");
         this.jtfOrder.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 STriangle.this.trianglePanel.setOrder(Integer.parseInt(STriangle.this.jtfOrder.getText()));
             }
         });
     }

     public static void main(String[] args) {
         JFrame frame = new JFrame("STriangle");
         STriangle applet = new STriangle();
         frame.add(applet);
         frame.setDefaultCloseOperation(3);
         frame.setSize(1024, 768);
         frame.setVisible(true);
     }

     static class STrianglePanel extends JPanel {
         private int order = 0;

         STrianglePanel() {
         }

         public void setOrder(int order) {
             this.order = order;
             this.repaint();
         }

         protected void paintComponent(Graphics g) {
             super.paintComponent(g);
             Point p1 = new Point(this.getWidth() / 2, 10);
             Point p2 = new Point(10, this.getHeight() - 10);
             Point p3 = new Point(this.getWidth() - 10, this.getHeight() - 10);
             displayTriangles(g, this.order, p1, p2, p3);
         }

         private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) {
             if(order == 0) {
                 g.drawLine(p1.x, p1.y, p2.x, p2.y);
                 g.drawLine(p1.x, p1.y, p3.x, p3.y);
                 g.drawLine(p2.x, p2.y, p3.x, p3.y);
             } else {
                 Point p12 = midpoint(p1, p2);
                 Point p23 = midpoint(p2, p3);
                 Point p31 = midpoint(p3, p1);
                 displayTriangles(g, order - 1, p1, p12, p31);
                 displayTriangles(g, order - 1, p12, p2, p23);
                 displayTriangles(g, order - 1, p31, p23, p3);
             }

         }

         private static Point midpoint(Point p1, Point p2) {
             return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
         }
     }
 }
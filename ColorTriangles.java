import java.awt.*;
import java.util.Random;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;
import javax.swing.JFrame;

class RandT extends JPanel
{
            public void paintComponent(Graphics g)
            {
                        super.paintComponent(g);
						setBackground(Color.WHITE);
                        Graphics2D g2d= (Graphics2D) g;
                        Random random=new Random();

                        for(int i=0; i<50; i++)
                        {

                                    GeneralPath triangle=new GeneralPath();

                                    int x=random.nextInt(375);
                                    int y=random.nextInt(375);
                                    triangle.moveTo(x,y);


                                    x=random.nextInt(375);
                                    y=random.nextInt(375);
                                    triangle.lineTo(x,y);

                                    x=random.nextInt(375);
                                    y=random.nextInt(375);
                                    triangle.lineTo(x,y);

                                    triangle.closePath();

                                    g2d.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));

                                    g2d.fill(triangle);
                        }
            }
}


public class ColorTriangles
{
            public static void main(String args[])
            {
                        JFrame frame=new JFrame("Drawing triangles....");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        RandT randT =new RandT();

                        frame.add(randT);
                        frame.setSize(400,400);
                        frame.setVisible(true);
            }
}
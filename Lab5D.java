package lab5d;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class Lab5D extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public Lab5D() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        
        /* Create Shapes */
        
        //shapes.add(new Rectangle(100, 100, 0, 100, 100));
        //shapes.add(new Circle(400, 100, 1, 50));
        //shapes.add(new Triangle(250, 350, 2, 100, 100));
        for (int i = 0; i<30; i++) {
            
            int lx = (int) (Math.random() * 500);
            int ly = (int) (Math.random() * 500);
            int lz = (int) (Math.random() * 9);
            int p1 = (int) (Math.random() * 90 + 10);
            int p2 = (int) (Math.random() * 90 + 10);

            int shape = (int) (Math.random() * 3 + 1);
            if (shape == 1)
                shapes.add(new Rectangle(lx, ly, lz, p1, p2));
            if (shape == 2)
                shapes.add(new Circle(lx, ly, lz, p1));
            if (shape == 3)
                shapes.add(new Triangle(lx, ly, lz, p1, p2));
        }
            
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        
                        // INSERT YOUR CODE HERE
                        g.fillRect((int) (s.getX() - (0.5 *((Rectangle) s).getWidth())), (int) (s.getY() - (0.5 * ((Rectangle) s).getHeight())), (int) ((Rectangle) s).getWidth(), (int) ((Rectangle) s).getHeight());
                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        // INSERT YOUR CODE HERE
                        g.fillOval((int) (s.getX() - ((Circle) s).getRadius()), (int) (s.getY() - ((Circle) s).getRadius()), (int) ((Circle) s).getRadius() * 2, (int) ((Circle) s).getRadius() * 2);
                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        
                        // INSERT YOUR CODE HERE
                        
                        int x1 = (int) (x + (((Triangle) s).getBase()/2));
                        int x2 = (int) (x - (((Triangle) s).getBase()/2));
                        int x3 = x;
                        int y1 = (int) (y + (((Triangle) s).getHeight()/2));
                        int y2 = (int) (y + (((Triangle) s).getHeight()/2));
                        int y3 = (int) (y - (((Triangle) s).getHeight()/2)) ;
                        int xPoints[] = {x1,x2,x3};
                        int yPoints[] = {y1,y2,y3};
                    
                        g.fillPolygon(xPoints, yPoints, 3);
                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.area()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}

package lab5d;


public class Point {
        
    private int x;
    private int y;
    private int z;
    
    
    public Point(int x, int y, int z) {
       
        
        if (x <= 0)
            x = 0;
        if (y <= 0)
            y = 0;
        if (x >= 500)
            x = 500;
        if (y >= 500)
            y = 500;
        if (z >= 500)
            z = 500;
        if (z <= 0)
            z = 0;
        this.x = x;      
        this.y = y;
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    
}
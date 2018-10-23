package lab5d;


public class Rectangle extends Shape {
     
    private double width;
    private double height;
    
    
    public Rectangle(int x, int y, int z, double width, double height) {
        super(x,y,z);
        this.setHeight(1.0);
        this.setHeight(height);
        this.setWidth(1.0);
        this.setWidth(width);
    
    }
    
    @Override
    public String toString() {
        return ("(" + super.getX() + "," + super.getY() + ") : " + "[ " + area() + " ]");
    }
    
    @Override
    public double area() {
        return(this.width * this.height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
}

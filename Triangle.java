package lab5d;


public class Triangle extends Shape {
     
    
    private double height;
    private double base;

    
    public Triangle(int x, int y, int z, double base, double height) {
        super(x,y,z);
        this.setHeight(1.0);
        this.setHeight(height);
        this.setBase(1.0);
        this.setBase(base);
    
    }
    
    @Override
    public String toString() {
        return ("(" + super.getX() + "," + super.getY() + ") : " + "/ " + area() + " \\");
        
    }
    
    @Override
    public double area() {
        return(0.5*this.base*this.height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
}

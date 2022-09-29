package dsa_polymorphism.src;

public class Rectangle extends Figure{

    private double base;
    private double h;

    public Rectangle(double base, double h){
        this.base = base;
        this.h = h; 
    }


    public String printParams() {
        double figArea = this.area();
        return "Rectangle base: " + this.base + " h:" +this.h + " and area:" + figArea;
    }

    @Override
    public double area() {   
        return this.base * this.h;
    }

    @Override
    public String toString() {
        return printParams();
    }
}
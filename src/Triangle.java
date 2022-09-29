package dsa_polymorphism.src;

public class Triangle extends Figure{

    private double base;
    private double h;

    public Triangle(double base, double h){
        this.base = base;
        this.h = h; 
    }


    public String printParams() {
        double figArea = this.area();
        return "Triangle base: " + this.base + " h:" + this.h + " and area:" + figArea;
    }

    @Override
    public double area() {
        return (this.base * this.h)/2;
    }   

    @Override
    public String toString() {
        return printParams();
    }
}
package dsa_polymorphism.src;

public class Rectangle extends Figure{

    private double base;
    private double h;

    public Rectangle(double base, double h){
        this.base = base;
        this.h = h; 
    }

    // public double rectangleArea() {
    //     return this.base * this.h;
    // }

    public String printParams() {
        double figArea = this.area();
        return "Rectangle base: " + this.base + " h:" +this.h + " and area:" + figArea;
    }

    @Override
    public double area() {   // area()) ???
        // TODO Auto-generated method stub
        return this.base * this.h;
    }
}
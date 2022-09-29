package dsa_polymorphism.src;
import java.lang.Math;

public class Circle extends Figure{

    private double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    // public double circleArea(){
    //     // pi * radio^2
    //     return 3.14 + Math.pow(this.radio, 2.0);
    // }

    public String printParams() {
        return "Circle radio: " + this.radio + " and area: " + this.area();
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 3.14 + Math.pow(this.radio, 2.0);
    }
    
}



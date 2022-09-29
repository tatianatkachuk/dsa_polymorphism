package dsa_polymorphism.src;

// abstract ??? implements comparable ???
public abstract class Figure implements Comparable<Figure>{
    
    public abstract double area();

    public int compareTo(Figure f){
        
        return (int) (f.area()-this.area());
    }
}

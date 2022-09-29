package dsa_polymorphism.src;

import java.util.Arrays; 

// Declare public class
public class FigureManager{

    // Declare method to sum all figure areas
    public static double sumOfAreas (Figure[] figVector) {
        double sumFigure = 0; 

        for (Figure fig : figVector){
            sumFigure = sumFigure + fig.area();
        }

        return sumFigure;

    }

    // Declare method to sort all figure areas
    public static void sortAreas (Figure[] areasArray) {
        Arrays.sort(areasArray);
    }

    public static void main(String[] args) {
        Figure[] figuresvector = new Figure[4];
        figuresvector[0] = new Triangle(5,3);
        figuresvector[1] = new Circle(15);
        figuresvector[2] = new Rectangle(5,3);
        figuresvector[3] = new Rectangle(5,5);

        // Sum areas
        double sumResult = FigureManager.sumOfAreas(figuresvector);

        System.out.println("The total sum of areas is:: " + sumResult);
        
        System.out.println("Areas of figures:: " + Arrays.asList(figuresvector));
        
        // Sort areas
        FigureManager.sortAreas(figuresvector);

        System.out.println("Sorted areas of figures:: " + Arrays.asList(figuresvector));

    }


}
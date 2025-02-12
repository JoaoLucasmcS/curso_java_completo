package q1_rectangle.Entities;

public class Rectangle {

    public double width;
    public double height;


    public double Area(){

        return width * height;

    }

    public double Perimeter(){

        return (width * 2) + (height * 2);

    }

    public double Diagonal(){

        double diagonal;
        diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;

    }





}

package edu.wpi.teamname;

//Write test cases for rectangle first, then move onto implementing the Circle class

public class Rectangle {

   private int length;
   private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    double getArea()
    {
        return width * length;
    }




}

import java.util.*;

//*******************************************************
// Circle.java
//
//
//*******************************************************
public class Circle {
    // add your instances here

    // constructors
    // default constructor - to be modified
    public Circle() {}

        private double x;
        private double y;
        private double radius;

    // customized constructor - to be modified
    public Circle(double xV, double yV, double radiusV) {
      x = xV;
      y = yV;
      radius = radiusV;
    }

    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    public String toString() {
        return "center: (" + x  + "," + y + ")" + "/nradius" + radius ;
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        return x;

    }


    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        return y;
    }

    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return radius;
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double xV) {
        x = xV;
    }


    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double yV) {
        y = yV;
    }


    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radiusV) {
        radius = radiusV;
    }

    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        double diameter = (radius * 2);
        return diameter;
    }


    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
      double area = (Math.PI * (radius * radius));
        return area;
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        double perimeter = (2 * Math.PI * this.radius);
        return perimeter;
    }

    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //                otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        // you will remove this line
        return true;
    }

    public boolean equals(Circle anotherCircle) {
        // you will remove this line
        return true;
    }

    public boolean isConcentric(Circle anotherCircle) {
        // you will remove this line
        return true;
    }

    public double distance(Circle anotherCircle) {
        // you will remove this line
        return 0.0;
    }

    public boolean intersects(Circle anotherCircle) {
        // you will remove this line
        return true;
    }

    // you are welcome to add more helper methods if needed

}

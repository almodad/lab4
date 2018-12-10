/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Almodad
 */
public class Circle { // save as "Circle.java"
    // private instance variable, not accessible from outside
    //this class
    private double radius;
    private String color;
    // 1st constructor, which sets both radius and color to
    //The default constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    // 2nd constructor with given radius, but color default
    //The parameterized constructor
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    // A public method for retrieving the radius
    //the getter or accessor
    public double getRadius() {
        return radius;
    }
    // A public method for computing the area of circle
    //the 
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
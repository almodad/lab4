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
public class TestCircle { // save as "TestCircle.java"
public static void main(String[] args) {
/* Declare and allocate an instance of class Circle called
c1 */
// with default radius and color
Circle c1 = new Circle();
// Use the dot operator to invoke methods of instance c1.
System.out.println("The circle has radius of "
+ c1.getRadius() + " and area of " + c1.getArea());
/* Declare and allocate an instance of class circle called
c2*/
// with the given radius and default color
Circle c2 = new Circle(5.0);
// Use the dot operator to invoke methods of instance c2.
System.out.println("The circle has radius of "
+ c2.getRadius() + " and area of " + c2.getArea());
}
}



import java.util.ArrayList;
/*
• Create a base class named Shape that contains one abstract
method draw().
• Create two concrete classes (Rectangle and Circle) that extend
Shape
• Create a test class that defines a method that accepts a list
that contains only child classes of shape
• Test your method by creating two ArrayList of Rectangle and
shapes and pass them to the generic method

*/
abstract class Shape {

    abstract void drow();
    
}
class Circle extends Shape{

    @Override
    void drow() {
    System.out.println("Circle");    
    }

}
class Rectangle extends Shape{

    @Override
    void drow() {
    System.out.println("Rectangle");    
    }

}

public class Test {
    public static void drawShape(ArrayList<? extends Shape > shape){
        for(int i=0;i<shape.size();i++){
            shape.get(i).drow();
        }
    
    }
    public static void main(String[] args) {
    ArrayList <Shape> shape = new ArrayList<Shape>();
    shape.add(new Circle());
    shape.add(new Rectangle());
    drawShape(shape);
    }
    }
    
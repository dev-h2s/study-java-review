package oop1.ex;

public class testMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        rectangle.caculatePerimeter();
        rectangle.calculateArea();
        rectangle.isSquare();
    }
}

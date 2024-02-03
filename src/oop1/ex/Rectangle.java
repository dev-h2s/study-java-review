package oop1.ex;

public class Rectangle { // 직사각형
    int height ;
    int width ;

     void calculateArea(){

         System.out.println("직사각형의 넓이는?"+height*width);

    }

    void caculatePerimeter(){
         System.out.println("변의 길이는??"+2*(height+width));

    }
    void isSquare(){
        boolean isSqure = width==height;
          System.out.println("정사각형인가??"+isSqure );
    }

}

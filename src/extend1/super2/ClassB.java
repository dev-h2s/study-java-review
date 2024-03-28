package extend1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){ // 해당 메서드가 호출되면 this로 인해 다른 생성자를 호출하게 됨
        this(a,0);
//        super(); // 부모클래스에 기본 생성자가 있을시 생략 가능
        System.out.println("ClassB 생성자="+a);
    }

    public ClassB(int a, int b){
//        super(); // 부모클래스에 기본 생성자가 있을시 생략 가능
        System.out.println("ClassB 생성자 a="+a+"b="+b);
    }



}

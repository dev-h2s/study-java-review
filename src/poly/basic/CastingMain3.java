package poly.basic;

//upcating Vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
    Child child = new Child();
    Parent parent1 = child; // 업캐스팅은 (parent) 생략 가능
    Parent parent2 = (Parent) child;

        parent1.prentMethod();
        parent2.prentMethod();
    }
}

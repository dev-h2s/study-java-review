package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.prentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child-> Child");
        Child child = new Child();
        child.childMethod();
        child.prentMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("parent - >child");
        // 부모타입은 자식타입을 참조가능
        Parent poly = new Child();
        poly.prentMethod();
//        poly.childMethod(); //부모 타입에선 자식의 메서드 호출 불가
        //자식 타입은 부모 타입을 참조 불가
//        Child child1 = new Parent();


    }
}

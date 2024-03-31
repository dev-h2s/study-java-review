package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("patent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("patent2 호출");

        call(parent2);



    }

    private static void call(Parent parent){
        parent.prentMethod();
        //Child 인스턴스인 경우 childMethod 실행
        if (parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;  => if 문에서 child 추가 하면 생략 가능
            child.childMethod();
        } else if (parent != null) {
            System.out.println("parent 인스턴스 맞음");
        }
    }
}

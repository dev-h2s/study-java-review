package extend1.access.Child;

import extend1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지가능
//        defaultValue = 1; 다른 패키지여서 접근 불가
//        privateValue = 1 ; 다른 클래스 접근불가
        protectedMethod();
        publicMethod();// 상속관계 or 같은 패키지가능
//        defaultMethod();
//        privateMethod();
        printParent(); // 퍼블릭 메서드에서 추가하여 사용가능
    }
}

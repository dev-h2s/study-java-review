package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 클래스와 같은이름
    // 장점: 직접 생성한 생성자를 반드시 호출한다
    // 필수로 입력하기때문에 아무 정보가없는 null이 들어가는 유령회원이 등장할 가능성을 원천 차단

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = "+name+"age="+age+"grade="+grade);
        this.name = name;
        this.age = age ;
        this.grade = grade;

    }
    // 추가 : 생성자 오버로딩
    MemberConstruct(String name, int age){
        this(name,age,50); //자신의 생성자를 호출함으로써 코드의 중복을 제거해줄 수 있다
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}

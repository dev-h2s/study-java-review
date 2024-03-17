package construct;

public class MemberInit {
    String name;
    int age;
    int grade;
    MemberInit(){} // 기본생성자는 작성하지 않아도 자동으로 만들어줌
    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

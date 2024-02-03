package construct;

//this의 생략 매개변수에 값이 없으면 지역변수를 가져간다
public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
    }
}

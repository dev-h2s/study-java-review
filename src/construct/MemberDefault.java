package construct;

//생성자는 반드시 호출되어야한다.
// 생성자가 없으면 자바에서 자동으로 기본 생성자가 제공된다.
//생성자가 하나라도 있으면 기본생성자가 제공되지 않는다. 이경우 개발자가 직접 정의한 생성자를 직접 호출
public class MemberDefault {
    String name;

    public MemberDefault(){ //기본 생성자
        System.out.println("생성자 호출");
    }
}

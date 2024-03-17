package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체를 생성함과 동시에 값을 호출해준다
        // 생성자는 매개변수 값을 넣어주지 않으면 문법적 오류
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        //생성자 없으면
//        MemberConstruct member3 = new MemberConstruct();
//        member3.initMember("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",13,20);

        MemberConstruct[] members = {member1,member2};

    for (MemberConstruct s : members){
        System.out.println("이름:"+s.name+"나이:"+s.age+"등급:"+s.grade   );
    }

    }
}

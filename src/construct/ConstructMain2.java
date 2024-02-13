package construct;

public class ConstructMain2 {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1",15,90);

        MemberConstruct member2 = new MemberConstruct("user2",13); // 매개변수의 갯수에따라 오버로딩 한 생성자를 적용시킬수 있음

        MemberConstruct[] members = {member1,member2};

    for (MemberConstruct s : members){
        System.out.println("이름:"+s.name+"나이:"+s.age+"등급:"+s.grade   );
    }

    }
}

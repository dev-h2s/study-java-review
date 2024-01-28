package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);
//        member1.name = "user1";
//        member1.age = 15;
//        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",15,90);

//        member2.name = "user1";
//        member2.age = 20;
//        member2.grade = 70;

        MemberInit[] members = {member1,member2};

        for (MemberInit s : members) {
            System.out.println("이름:"+s.name+"나이:"+s.age+"등급:"+s.grade   );

        }

    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

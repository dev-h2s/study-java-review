package construct;

public class MemberInitMain3 {
        public static void main(String[] args) {
            MemberInit member1 = new MemberInit();
            member1.initMember("user1",15,90);


            MemberInit member2 = new MemberInit();
            member2.initMember("user2",152,903);

            MemberInit[] members = {member1,member2};

            for (MemberInit s : members) {
                System.out.println("이름:"+s.name+"나이:"+s.age+"등급:"+s.grade   );

            }

        }
        //=> 해딩 코드가 객체지향을 위해 MemberInit으로 이동

    }

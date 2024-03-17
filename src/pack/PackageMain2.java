package pack;
import  pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {

        Data data = new Data();
        // 다른 패키지 불러오는법
        User user = new User();
        User2 user2 = new User2(); // import 사용으로 패키지 명 생략 가능
    }
}

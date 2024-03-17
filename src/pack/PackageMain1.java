package pack;

public class PackageMain1 {
    public static void main(String[] args) {

        Data data = new Data();
        // 다른 패키지 불러오는법
        pack.a.User user = new pack.a.User();
    }
}

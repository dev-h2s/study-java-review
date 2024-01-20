package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data ="+ data);
        data = new Data();// 참조값이 생김
        System.out.println("2. data ="+ data);
        data = null;
        System.out.println("3. data ="+data);

    }
}

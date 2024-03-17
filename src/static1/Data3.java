package static1;

public class Data3 {
    public String name;
    public static int count; // static은 클래스에 직접 접근할 수 있게해줌

    public Data3(String name) {
        this.name = name;
        count++;
    }
}

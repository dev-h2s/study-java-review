package ref;
// 지역 변수 null 일때
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data= "+ data.value);
    }
}

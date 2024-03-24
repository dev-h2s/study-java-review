package final1;

public class FinalLocalMain {
//final: 값이 한번 들어오면 바꿀수없다
    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1 = 10;
//        data1 = 20;// 컴파일오류

        //final 지역변수2
        final int data2;
        data2 = 10;
//        data2 = 20;// 컴파일오류
        method(10);
    }

    static void method(final int parameter){
//        parameter = 20; 컴파일 오류
    }
}

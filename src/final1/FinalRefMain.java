package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();//참조형
//        data = new Data();// final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        //인스턴스는 값을 바꿀수 있다 Data.value는 불가.

    }
}

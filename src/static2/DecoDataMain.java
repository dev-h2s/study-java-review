package static2;

import static static2.DecoData.*; // 클래스명 생략가능

public class DecoDataMain {
    public static void main(String[] args) {

        DecoData.staticCall();
        staticCall();
        staticCall();

        System.out.println("정적호출");
        staticCall();
        System.out.println();

        System.out.println("인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();
        System.out.println();

        System.out.println("인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        System.out.println();

        staticCall(data1);

        //추가
        //인스턴스를 통한 스태틱 메서드 접근 : 추천 안함
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();
    }
}

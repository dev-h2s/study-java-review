package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
// 스태틱 메서드는 스태틱 변수와 스태틱 메서드에만 접근 가능
    public static void staticCall(){
        staticValue++; //정적 변수 접근
        staticMethod(); // 정적 변수 접근
//        instanceValue; //인스턴스 변수 접근, compile error
//        instanceMethod(); //인스턴스 메서드 접근, compile error
    }

    //인스턴스 메서드는 스태틱 메서드와 인스턴스 메서드 둘다 접근 가능
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod();// 인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod();// 정적 메서드 접근
    }

    //슽태틱 메서드지만 매개변수를 받으면 인스턴스 호출 가능
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue="+ instanceValue);
        System.out.println("staticValue"+staticValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue="+ staticValue);
    }
}

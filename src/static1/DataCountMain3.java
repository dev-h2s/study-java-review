package static1;

import org.w3c.dom.ls.LSOutput;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count =" + Data3.count);
        //인스턴스가 아닌 클래스를 직접 가져다 쓰면서 메서드영역에서 해당 변수 관리
        Data3 data2 = new Data3("B");
        System.out.println("B count =" + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("B count =" + Data3.count);

        //추가
        //인스턴스로 인한 스태틱 변수 접근 -> 권장하지 않는다( 코드를 읽을때 가져다 쓰는 입장에서 스태틱 변수인지 모를수 있음)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스로 인한 클래스 변수 접근
        Data3 data5 = new Data3("E");
        System.out.println(Data3.count);

    }


}

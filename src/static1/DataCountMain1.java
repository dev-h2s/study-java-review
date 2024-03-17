package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = "+ data1.count);
        System.out.println("A count = "+ data1);
        // 인스터스가 각각 새로 만들어져 다 다른 참조값을 가지고있어서 count가 증가하지 않고 모두 1


        Data1 data2 = new Data1("B");
        System.out.println("B count = "+ data2.count);
        System.out.println("A count = "+ data2);


        Data1 data3 = new Data1("C");
        System.out.println("C count = "+ data3.count);
        System.out.println("A count = "+ data3);

    }
}

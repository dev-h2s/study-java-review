package oop1;
// 호출하는 인스턴스에 기능을 다 넣어놓고 호출만 하는것이 응집도가 높다
public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종숫자 ="+valueData.value);
    }
}

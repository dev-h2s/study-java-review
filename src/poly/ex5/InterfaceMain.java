package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal() { 추상메서드 인스턴스 생성 불가
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

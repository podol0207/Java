package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스 생성 불가

        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}

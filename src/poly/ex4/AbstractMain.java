package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 이동 테스트 시작");
        abstractAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
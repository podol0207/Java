package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAni(animal);
        }
    }
    private static void soundAni(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

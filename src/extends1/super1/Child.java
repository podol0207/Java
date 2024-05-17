package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + value); // this 생략 가능 -> 없으면 자기 자신에서 먼저 찾고 없으면 부모에게서 찾음
        System.out.println("this value = " + super.value);
    }
}

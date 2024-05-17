package fanal1;

public class FieldInit {

    static final int CONST_VALUE = 10;

    final int value = 10;
    //초기 값이 있는 final변수는 생성자 불가
//    public FieldInit(int value) {
//        this.value = value; 컴파일 오류
//    }
}

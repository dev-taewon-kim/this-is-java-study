package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        /*
        초기화되지 않은 변수 value를 연산식에 사용하여 오류 발생

        int value;
        int result = value + 10;
         */

        // 정상 코드
        int value = 30;
        int result = value + 10;
        System.out.println(result);
    }
}

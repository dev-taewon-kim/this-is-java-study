package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        /*
        int 자료형의 최댓값(2147483647)을 초과하는 경우에는 리터럴의 맨 뒤에 l 또는 L을 붙여
        리터럴이 long 자료형임을 명시해야 한다.
        아래 코드는 오류가 발생하는 코드이다.
        long var3 = 10000000000;
        */
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}

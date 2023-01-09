package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        /*
        byte 자료형은 크기가 1byte 이며 1byte => 8bit => 2^(8-1) => 128이다.
        따라서 표현할 수 있는 숫자는 0~127이다.
        128을 대입하려고 하면 오류가 발생한다.
        byte var6 = 128;
        */

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}

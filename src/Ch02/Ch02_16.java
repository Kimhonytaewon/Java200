package Ch02;

import java.util.Scanner;

public class Ch02_16 {
    //String형의 변수를 문자열로 초기화하거나 변수에 문자열을 대입하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("문자 a를 입력하세요");
        String a = scanf.next();
        System.out.println("문자 b를 입력하세요");
        String b = scanf.next();
        System.out.println("문자 a는 " + a + "입니다.");
        System.out.println("문자 b는 " + b + "입니다.");
        System.out.println("----------------");

        System.out.println("바꿀 문자를 입력하세요");
        a = scanf.next();
        System.out.println("문자 a는 " + a + "입니다.");
        System.out.println("문자 b는 " + b + "입니다.");
    }
}

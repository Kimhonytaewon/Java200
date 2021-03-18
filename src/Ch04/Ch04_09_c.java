package Ch04;

import java.util.Scanner;

public class Ch04_09_c {
    //양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int b = 0; //자릿수 파악
        int a;

        do {
            System.out.println("양의 정수 a를 입력하세요");
            a = scanf.nextInt();
        } while (a <= 0);

        while (a > 0) {
            b++;
            a = a / 10;
        }
        System.out.println("입력한 수는 " + b + "자리입니다.");
    }
}

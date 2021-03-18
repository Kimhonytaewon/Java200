package Ch03;

import java.util.Scanner;

public class Ch03_02 {
    //정숫값을 읽어서 절댓값을 구하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();

        if(a < 0) {
            a = -a;
            System.out.println("a의 절댓값은 " + a + "입니다.");
        } else {
            System.out.println("a의 절댓값은 " + a + "입니다.");
        }
    }
}

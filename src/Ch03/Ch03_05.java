package Ch03;

import java.util.Scanner;

public class Ch03_05 {
    //정숫값을 읽어 부호(양수/음수/0)룰 판정하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();

        if(a > 0) {
            System.out.println("정수 a는 양수입니다.");
        } else if(a < 0) {
            System.out.println("정수 a는 음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
}

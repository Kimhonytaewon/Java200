package Ch03;

import java.util.Scanner;

public class Ch03_06 {
    //[문제3-5]의 프로그램에서 마지막 else를 else if (n==0)으로 변경하면 어떻게 되는지 확인하자.
    public static void main(String[] args) {
            Scanner scanf = new Scanner(System.in);
            System.out.println("정수 a를 입력하세요");
            int a = scanf.nextInt();

            if(a > 0) {
                System.out.println("정수 a는 양수입니다.");
            } else if(a < 0) {
                System.out.println("정수 a는 음수입니다.");
            } else if(a == 0) {
                System.out.println("0입니다.");
            }
    }
}

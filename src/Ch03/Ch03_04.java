package Ch03;

import java.util.Scanner;

public class Ch03_04 {
    //[문제 3-3]의 프로그램을 논리 부정 연산자(!)를 사용해서 수정하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b= scanf.nextInt();

        if(!(a % b == 0)) {
            System.out.println("b는 a의 약수가 아니다.");
        } else {
            System.out.println("b는 a의 약수이다.");
        }
    }
}

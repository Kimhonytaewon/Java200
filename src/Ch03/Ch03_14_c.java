package Ch03;

import java.util.Scanner;

public class Ch03_14_c {
    //두 정숫값의 차가 10이하인 경우 "두 값의 차는 10이하 입니다."라고 표시하고,
    //그렇지 않으면 "두 값의 차는 11이상 입니다." 라고 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();

        int gap = a >= b ? a - b : b - a;

        if(gap == 0) {
            System.out.println("두 값은 같습니다.");
        } else if(gap <= 10) {
            System.out.println("두 값의 차는 10이하 입니다.");
        } else {
            System.out.println("두 값의 차는 11이상 입니다.");
        }

        /* 다른 방법
        int gap;
        if(a >= b) {
            gap = a - b;
            if(gap <= 10){
                System.out.println("두 값의 차는 10이하 입니다.");
            } else {
                System.out.println("두 값의 차는 11이상 입니다.");
            }
        } else {
            gap = b - a;
            if(gap <= 10){
                System.out.println("두 값의 차는 10이하 입니다.");
            } else {
                System.out.println("두 값의 차는 11이상 입니다.");
            }
        }
        */
    }
}

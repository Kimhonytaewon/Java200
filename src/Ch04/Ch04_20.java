package Ch04;

import java.util.Scanner;

public class Ch04_20 {
    //달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하자.
    //원하는 만큼 입력 및 출력 할 수 있게 하며,
    // 1~12 이외의 값이 입력된 경우에는 재입력 하도록 할 것(do문 안에 do문이 들어가는 이중루프가 된다.)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int b = 1;
        while (b == 1) {
            int a;
            do {
                System.out.println("몇 월 입니까?");
                a = scanf.nextInt();
            } while (a > 12 || a < 1);

            if(a > 2 && a < 6) {
                System.out.println("봄입니다.");
            } else if(a > 5 && a < 9) {
                System.out.println("여름입니다.");
            } else if(a > 8 && a < 12) {
                System.out.println("가을입니다.");
            } else {
                System.out.println("겨울입니다.");
            }

            System.out.println("다시 하겠습니까?");
            System.out.println("yes: 1, no: 2");
            b = scanf.nextInt();
        }
        System.out.println("-END-");
    }
}

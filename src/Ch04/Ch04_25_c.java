package Ch04;

import java.util.Scanner;

public class Ch04_25_c {
    //양의 정숫값을 읽어서 소수인지를 판정하는 프로그램을 작성하자.
    // 소수란 2이상 n미만의 수 중 어떤 수로도 나누어지지않는 정숫값 n이다.
    // (즉, 자기 자신과 1로만 나누어지는 수)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int a;
        do {
            System.out.println("2 이상의 양수 a를 입력하세요");
            a = scanf.nextInt();
        } while (a <= 1);

        int i;
        for(i = 2; i < a; i++) {
            if(a % i == 0) {
                break;
            }
        }
        System.out.println(i);

        if(i == a) {
            System.out.println("소수입니다.");
        } else  {
            System.out.println("소수가 아닙니다.");
        }
    }

}

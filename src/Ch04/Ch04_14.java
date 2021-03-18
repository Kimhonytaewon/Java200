package Ch04;

import java.util.Scanner;

public class Ch04_14 {
    //1부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 n을 입력하세요 ");
        int n = scanf.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
    }
}

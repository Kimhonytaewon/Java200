package Ch04;

import java.util.Scanner;

public class Ch04_15 {
    //[문제 4-14]프로그램을 수정해서 결과뿐만 아니라 계산식까지 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 n을 입력하세요 ");
        int n = scanf.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
            if(i < n) {
                System.out.print(i);
                System.out.print("+");
            } else {
                System.out.print(i);
                System.out.print("=");
                System.out.print(sum);
            }
        }
        System.out.println();
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}

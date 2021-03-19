package Ch04;

import java.util.Scanner;

public class Ch04_16_c {
    //신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자. 표시할 신장의 범위(시작값/종료값/증가값)는 정숫값으로 입력 받을 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 cm부터: ");
        int min = scanf.nextInt();
        System.out.println("몇 cm까지: ");
        int max = scanf.nextInt();
        System.out.println("단위: ");
        int step = scanf.nextInt();

        for(int i = min; i <= max; i += step) {
            System.out.print(i);
            System.out.println(" "+ (i - 100) * 0.9);
        }

    }
}

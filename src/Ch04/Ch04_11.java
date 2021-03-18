package Ch04;

import java.util.Scanner;

public class Ch04_11 {
    //기호 문자를 임의의 개수만큼 출력했던 [문제 4-7]을 for문으로 작성하자.
    //[문제 4-7]
    //입력한 값의 개수만큼 "*"를 표시하는 프로그램을 작성하자. 마지막에는 줄 바꿈 문자를 출력할 것
    //단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안된다.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("몇 개의 *을 표시할까요? ");
        int a = scanf.nextInt();;

        if (a > 0) {
            for(int i = 1; i <= a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

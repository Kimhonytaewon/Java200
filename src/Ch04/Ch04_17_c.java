package Ch04;

import java.util.Scanner;

public class Ch04_17_c {
    //읽은 개수만큼 '*'를 표시하는 [문제 4-11]을 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("몇 개의 *을 표시할까요? ");
        int a = scanf.nextInt();;

        if (a > 0) {
            for(int i = 1; i <= a; i++) {
                System.out.print("*");

                if(i % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}

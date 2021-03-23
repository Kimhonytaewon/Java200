package Ch04;

import java.util.Scanner;

public class Ch04_24_c {
    //n단의 숫자 피라미드를 표시하는 프로그램을 작성하라. i번째 행에는 i%10을 표시할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 단의 피라미드를 출력하시겠습니까?");
        int a = scanf.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i-1; j++) {
                System.out.print(i%10);
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
    }
}

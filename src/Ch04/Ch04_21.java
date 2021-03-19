package Ch04;

import java.util.Scanner;

public class Ch04_21 {
    //기호 문자 "*"를 나열해서 n단의 정방형을 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 단?");
        int a = scanf.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

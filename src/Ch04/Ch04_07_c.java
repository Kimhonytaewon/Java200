package Ch04;

import java.util.Scanner;

public class Ch04_07_c {
    //입력한 값의 개수만큼 "*"를 표시하는 프로그램을 작성하자. 마지막에는 줄 바꿈 문자를 출력할 것
    //단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안된다.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("몇 개의 *을 표시할까요? ");
        int a = scanf.nextInt();;

        if(a > 0) {
            int i = 0;
            while (i < a) {
                System.out.print("*");
                i++;
            }
            System.out.println();
        }
    }
}

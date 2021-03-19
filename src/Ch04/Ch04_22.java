package Ch04;

import java.util.Scanner;

public class Ch04_22 {
    //기호 문자 "*"를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성하자.
    //직각의 위치가 왼쪽 아래, 왼쪽 위, 오른쪽 아래, 오른쪽 위에 표시하는 프로그램을 각각 작성할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //1. 왼쪽 아래가 직각
        System.out.println("아랫변의 *갯수는?");
        int a = scanf.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; i >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        //2. 오른쪽 위가 직각

    }
}

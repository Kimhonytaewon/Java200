package Ch04;

import java.util.Scanner;

public class Ch04_08_c {
    //읽은 값의 개수만큼 "*"와 "+"를 번갈아 가며 표시하는 프로그램을 작성하자
    //(마지막에는 줄 바꿈 문자를 출력 할 것)
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 개를 표시하시겠습니까? ");
        int a = scanf.nextInt();

        if(a > 0) {
            int i = 0;
            while (i < a) {
                i++;
                if(i % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("줄 바꿈");
        }
    }
}

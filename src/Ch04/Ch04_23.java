package Ch04;

import java.util.Scanner;

public class Ch04_23 {
    //n단 피라미드를 표시하는 프로그램을 작성하자. i행째에는 (i-1) * 2 + 1개의 "*"기호를 표시하고
    //마지막 행인 n행째에는 (n-1) * 2 + 1개의 "*"를 표시할 것
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 단의 피라미드를 출력하시겠습니까?");
        int a = scanf.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

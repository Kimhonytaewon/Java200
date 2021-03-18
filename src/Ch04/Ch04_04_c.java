package Ch04;

import java.util.Scanner;

public class Ch04_04_c {
    //2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은것부터 큰 순으로 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //1.
        System.out.println("정수 a를 입력하세요");
        int a = scanf.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = scanf.nextInt();

        if(a <= b){
            System.out.println(a + "와 "+ b +"사이의 정수는");
            for(int i = a; a <= b; a++) {
                System.out.println(a);
            }
            System.out.println("입니다.");
        } else {
            System.out.println(b + "와 "+ a +"사이의 정수는");
            for(int i = b; b <= a; b++) {
                System.out.println(b);
            }
            System.out.println("입니다.");
        }
        System.out.println("---------------------------------------");

        //2.
        System.out.println("정수 c를 입력하세요");
        int c = scanf.nextInt();
        System.out.println("정수 d를 입력하세요");
        int d = scanf.nextInt();
        int min;

        if(c > d) {
            min = d;
            d = c;
            c = min;
        }

        System.out.println(c + "와 " + d + "사이의 값은");
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= d);
        System.out.println("입니다.");
    }
}

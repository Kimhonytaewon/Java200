package Ch04;

import java.util.Scanner;

public class Ch04_18 {
    //입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요 ");
        int a = scanf.nextInt();
        int total = 0;

        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                System.out.print(i + " ");
                total++;
            }
        }
        System.out.println("");
        System.out.println("정수 a의 약수의 갯수는: " + total + "개 입니다.");
    }
}

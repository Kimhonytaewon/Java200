package Ch03;

import java.util.Scanner;

public class Ch03_11 {
    //입력한 점수에 따라 수/우/미/양/가를 판정하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("점수를 입력하세요");
        int a = scanf.nextInt();
        if(a >= 90) {
            System.out.println("수 입니다.");
        } else if(a >= 80) {
            System.out.println("우 입니다.");
        } else if(a >= 70) {
            System.out.println("미 입니다.");
        } else if(a >= 60) {
            System.out.println("양 입니다");
        } else {
            System.out.println("가 입니다.");
        }
    }
}

package Ch03;

import java.util.Scanner;

public class Ch03_21 {
    //월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("몇 월입니까?");
        int a = scanf.nextInt();

        switch (a) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
            default:
                System.out.println("!경고! 1~12월만 입력하세요");
        }
    }
}

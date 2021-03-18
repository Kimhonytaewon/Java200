package Ch02;

import java.util.Scanner;

public class Ch02_14 {
    //키보드에 입력한 성과 이름으로 인사하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("성을 입력하세요");
        String firstName = scanf.next();
        System.out.println("이름을 입력하세요");
        String lastName = scanf.next();

        System.out.println("안녕하세요? " + firstName + lastName + "님");
    }
}

package Ch02;

import java.util.Scanner;

public class Ch02_15 {
    //입력한 주소를 표시하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("도를 입력하세요");
        String address1 = scanf.next();

        System.out.println("시를 입력하세요");
        String address2 = scanf.next();

        System.out.println("동을 입력하세요");
        String address3 = scanf.next();

        System.out.println("상세주소를 입력하세요");
        String address4 = scanf.next();

        System.out.println("입력하신 주소는");
        System.out.println(address1 + " " + address2 + " " + address3 + " " + address4 + " 입니다.");
    }
}

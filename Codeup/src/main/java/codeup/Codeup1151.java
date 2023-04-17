package codeup;

import java.util.Scanner;

public class Codeup1151 {//입력받은 정수가 10보다 작으면 small을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 10) {
            System.out.print("small");
        }
    }
}

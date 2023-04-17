package codeup;

import java.util.Scanner;

public class Codeup1153 { // 입력받은 두 정수를 비교하여 먼저 입력된 정수가 크면 > 작으면 < 같으면 = 출력
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.print(">");
        }else if (a < b) {
            System.out.print("<");
        }else if (a == b) {
            System.out.print("=");
        }
    }
}

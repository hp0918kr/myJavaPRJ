package codeup;

import java.util.Scanner;

public class Codeup1154 {//입력받은 두 정수를 큰수 - 작은수의 값으로 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.printf("%d", a - b);
        }else if (a < b) {
            System.out.printf("%d", b - a);
        }else if (a == b) {
            System.out.printf("%d", a - b);
        }
    }
}

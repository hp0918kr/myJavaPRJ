package codeup;

import java.util.Scanner;

public class Codeup1066 { // 짝수이면 even 아니면 odd를 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}



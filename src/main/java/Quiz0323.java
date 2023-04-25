package src.main.java;

import java.util.Scanner;

public class Quiz0323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값 : ");
        int a = sc.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.print("3의 배수와 5의 배수를 만족합니다.");
        } else if (a % 3 == 0) {
            System.out.print("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.print("5의 배수입니다.");
        } else {
            System.out.print("3의 배수와 5의 배수도 만족하지 않습니다.");
        }
    }
}
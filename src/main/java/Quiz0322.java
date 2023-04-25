package src.main.java;

import java.util.Scanner;

public class Quiz0322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 3 == 0) {
            System.out.print("3의 배수입니다.");
        }
    }
}

package codeup;

import java.util.Scanner;

public class Codeup1068 { //입력받은 학점을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 90) {
            System.out.print("A");
        }else if (a >= 70) {
            System.out.print("B");
        }else if (a >= 40) {
            System.out.print("C");
        }else if (a >= 0) {
            System.out.print("D");
        }
    }
}

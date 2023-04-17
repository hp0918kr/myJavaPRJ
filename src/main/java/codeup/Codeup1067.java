package codeup;

import java.util.Scanner;

public class Codeup1067 { // 입력받은 정수가 0보다 작으면 minus 아니면 plus를 출력하고
                          // 동시에 짝수이면 even 아니면 odd를 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0)
            System.out.println("minus");
        else {
            System.out.println("plus");
        } if (a % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}


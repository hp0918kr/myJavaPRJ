package codeup;

import java.util.Scanner;

public class Codeup1152 {//입력받은 정수가 10보다 작으면 small, 크면 big출력
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 10 ) {
            System.out.print("small");
        }else{
            System.out.print("big");
        }
    }
}

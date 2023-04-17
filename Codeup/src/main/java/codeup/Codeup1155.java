package codeup;

import java.util.Scanner;

public class Codeup1155 { //7의 배수면 multiple 아니면 not multiple 출력
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 7 == 0) {
            System.out.print("multiple");
        }else {
            System.out.print("mot multiple");
        }
    }
}

package codeup;

import java.util.Scanner;

public class Codeup1156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
    }
}

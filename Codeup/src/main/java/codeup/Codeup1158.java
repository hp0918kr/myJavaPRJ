package codeup;

import java.util.Scanner;

public class Codeup1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((30 <= a && a <= 40) || (60 <= a && a <= 70)) {
            System.out.print("win");
        }else{
            System.out.print("lose");
        }
    }
}

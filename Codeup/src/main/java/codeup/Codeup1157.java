package codeup;

import java.util.Scanner;

public class Codeup1157 { //입력받은 값이 50보다 크고 60보다 작으면 win 출력 소수점도 포함
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        float  a = sc.nextFloat();
        if ( a >= 50 && a <= 60) {
            System.out.print("win");
        }else{
            System.out.print("lose");
        }
    }
}

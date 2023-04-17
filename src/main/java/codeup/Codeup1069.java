package codeup;

import java.util.Scanner;

public class Codeup1069 { // 입력받은 학점에 알맞는 문장을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch(a){
            case 'A' :
                System.out.print("best!!!");
                break;
            case 'B':
                System.out.print("good!!");
                break;
            case 'C':
                System.out.print("run!");
                break;
            case 'D' :
                System.out.print("slowly~");
                break;
            default:
                System.out.print("what?");
        }
    }
}

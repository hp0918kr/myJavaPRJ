package src.main.java;

public class Quiz0330 {
    public static void main(String[] args) {
        int i, j = 1;
        for(i = 2; i < 11 && j < 10; i++) {
            if (i == 10) {
                i = 1;
                j++;
                System.out.println();
            }else
            System.out.printf(i + "x" + j + "=" + i * j + " ");
        }
    }
}

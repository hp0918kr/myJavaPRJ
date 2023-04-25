package src.main.java;

public class Quiz0331 {
    public static void main(String[] args) {
        int i, j = 0;
        for (i = 1; i < 6; ) {
            if (j < i) {
                j++;
                System.out.print("*");
            } else {
                j = 0;
                i++;
                System.out.println();

            }
        }
    }
}

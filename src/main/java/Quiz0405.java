package src.main.java;

public class Quiz0405 {
    public static void main(String[] args) {
        int i = 2, j = 1;
        while (i < 10 && j < 10){
            System.out.printf(i+ "X" + j + "=" + i * j + " ");
            i++;
            if(i==10) {
                j++;
                i = 1;
                System.out.println();
            }
        }
    }
}

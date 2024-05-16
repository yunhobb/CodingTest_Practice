import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(sc.nextLine());

        if (score >= 90 && score <= 100) {
            System.out.println("A");
            return;
        }
        if (score >= 80 && score <= 89) {
            System.out.println("B");
            return;
        }
        if (score >= 70 && score <= 79) {
            System.out.println("C");
            return;
        }
        if (score >= 60 && score <= 69) {
            System.out.println("D");
            return;
        }
        if (score < 60) {
            System.out.println("F");
        }
    }
}

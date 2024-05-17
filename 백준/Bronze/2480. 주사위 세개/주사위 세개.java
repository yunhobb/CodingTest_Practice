
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        int totalAmount;

        if (a == b && b == c) { // 모든 숫자가 같은 경우
            totalAmount = 10000 + a * 1000;
        } else if (a == b || a == c) { // a와 b가 같거나 a와 c가 같은 경우
            totalAmount = 1000 + a * 100;
        } else if (b == c) { // b와 c가 같은 경우
            totalAmount = 1000 + b * 100;
        } else { // 모두 다른 경우
            int biggestInt = Math.max(a, Math.max(b, c));
            totalAmount = biggestInt * 100;
        }

        System.out.println(totalAmount);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int hour = Integer.parseInt(inputs[0]);
        int minute = Integer.parseInt(inputs[1]);

        if (minute < 45) {
            hour = hour - 1;
            minute = minute + 60 - 45;
            if (hour < 0) {
                hour = 23;
            }
        } else {
            minute = minute - 45;
        }

        System.out.println(hour + " " + minute);
    }
}

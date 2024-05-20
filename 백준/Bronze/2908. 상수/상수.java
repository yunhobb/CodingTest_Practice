
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        String a = input[0];
        String b = input[1];

        int reverseA = reverseNumber(a);
        int reverseB = reverseNumber(b);

        if (reverseA >= reverseB) {
            System.out.println(reverseA);
        }

        if (reverseA <= reverseB) {
            System.out.println(reverseB);
        }
    }

    public static int reverseNumber(String input) {
        int a = Integer.parseInt(input);
        int reverseNumber = 0;

        while (a != 0) {
            int digit =  a % 10;
            reverseNumber = reverseNumber * 10 + digit;
            a /= 10;
        }
        return reverseNumber;
    }
}

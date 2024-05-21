
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        int inputLength = input.length;
        for (int i = 0; i < inputLength / 2; i++) {
            if (!input[i].equals(input[inputLength - 1 - i])) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}

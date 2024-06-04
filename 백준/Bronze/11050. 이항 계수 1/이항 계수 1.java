
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        if (k>n/2) {
            k = n - k;
        }

        int result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * n;
            n--;
            result = result / i;
        }

        System.out.println(result);
    }
}

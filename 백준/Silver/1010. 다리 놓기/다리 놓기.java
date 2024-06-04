
import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <t; i++) {
            String[] inputs = br.readLine().split(" ");
            int n = Integer.parseInt(inputs[1]);
            int m = Integer.parseInt(inputs[0]);

            if (m > n / 2) {
                m = n - m;
            }

            int result = 1;
            for (int j = 1; j <= m; j++) {
                result = result * n;
                n--;
                result = result / j;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}

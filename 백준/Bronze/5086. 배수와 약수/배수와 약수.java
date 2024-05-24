
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;

        while ((input = br.readLine()) != null) {
            String[] inputs = input.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            if (a == 0) {
                break;
            }

            if (a < b && b % a == 0) {
                sb.append("factor").append("\n");
                continue;
            }
            if (a > b && a % b == 0) {
                sb.append("multiple").append("\n");
                continue;
            }
            if (b % a != 0 || a % b != 0) {
                sb.append("neither").append("\n");
            }
        }
        System.out.println(sb);
    }
}

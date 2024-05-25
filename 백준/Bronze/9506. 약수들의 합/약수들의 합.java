
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum = sum + i;
                }
            }
            sb.append(n);
            if (n == sum) {
                sb.append(" = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    sb.append(list.get(i) + " + ");
                }
                sb.append((list.get(list.size() - 1)));
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

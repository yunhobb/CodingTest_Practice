
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        List<Integer> buckets = new ArrayList<>(n);
        for (int x = 0; x < n; x++) {
            buckets.add(0);
        }

        for (int a = 0; a < m; a++) {
            String[] inputs = br.readLine().split(" ");
            int i = Integer.parseInt(inputs[0]) - 1;
            int j = Integer.parseInt(inputs[1]) - 1;
            int k = Integer.parseInt(inputs[2]);
            for (int b = i; b <= j; b++) {
                buckets.set(b, k);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int c = 0; c < n; c++) {
            sb.append(buckets.get(c)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

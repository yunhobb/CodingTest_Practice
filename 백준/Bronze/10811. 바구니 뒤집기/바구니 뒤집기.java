
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
        for (int x = 1; x <= n; x++) {
            buckets.add(x);
        }

        for (int a = 0; a < m; a++) {
            String[] inputs = br.readLine().split(" ");
            int i = Integer.parseInt(inputs[0]) - 1;
            int j = Integer.parseInt(inputs[1]) - 1;

            while (i < j) {
                int temp = buckets.get(i);
                buckets.set(i, buckets.get(j));
                buckets.set(j, temp);
                i++;
                j--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int bucket : buckets) {
            sb.append(bucket).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

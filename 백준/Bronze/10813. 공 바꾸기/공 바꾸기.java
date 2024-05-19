
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
        for (int b = 0; b < n; b++) {
            buckets.add(b + 1);
        }

        int temp;
        for (int a = 0; a < m; a++) {
            String[] ij = br.readLine().split(" ");
            int i = Integer.parseInt(ij[0]) - 1;
            int j = Integer.parseInt(ij[1]) - 1;

            temp = buckets.get(i);
            buckets.set(i, buckets.get(j));
            buckets.set(j, temp);
        }

        for (int bucket : buckets) {
            System.out.print(bucket + " ");
        }
    }
}

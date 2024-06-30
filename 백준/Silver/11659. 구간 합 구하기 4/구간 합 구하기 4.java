
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] commands = br.readLine().split(" ");

        int n = Integer.parseInt(commands[0]);
        int m = Integer.parseInt(commands[1]);

        int[] arr = new int[n + 1];
        int[] prefixSum = new int[n + 1];

        String[] inputs = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(inputs[i - 1]); 
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] ranges = br.readLine().split(" ");
            int start = Integer.parseInt(ranges[0]);
            int end = Integer.parseInt(ranges[1]);

            int sum = prefixSum[end] - prefixSum[start - 1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
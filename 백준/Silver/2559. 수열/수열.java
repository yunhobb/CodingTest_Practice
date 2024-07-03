
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int[] days = new int[n];

        String[] vals = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(vals[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1 - k; i++) {    // K 개씩 묶어서 모두 더한 뒤 최댓값 구하기
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += days[j];
            }
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            time[i][0] = Integer.parseInt(inputs[0]);
            time[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count= 0;
        int current_end_time = 0;
        for (int i = 0; i < n; i++) {
            if (current_end_time <= time[i][0]) {
                current_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}

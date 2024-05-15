
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(final Integer o1, Integer o2) {
                int absO1 = Math.abs(o1);
                int absO2 = Math.abs(o2);
                if (absO1 > absO2) {
                    return absO1 - absO2;
                } else if (absO1 == absO2) {
                    return o1 - o2;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (pq.isEmpty()) {
                    sb.append("0").append("\n");
                }
                if (!pq.isEmpty()) {
                    sb.append(pq.poll()).append("\n");
                }
            }
            if (input != 0) {
                pq.offer(input);
            }
        }
        System.out.println(sb);
    }
}

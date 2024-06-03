
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        int[] queuestack = new int[n];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            queuestack[i] = Integer.parseInt(inputs[i]);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (queuestack[i] == 0) {
                deque.offerLast(num);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            deque.offerFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.pollLast() + " ");
        }
        System.out.println(sb);
        
    }
}

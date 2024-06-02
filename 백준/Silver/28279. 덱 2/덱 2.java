
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.startsWith("1")) {
                deque.offerFirst(Integer.parseInt(input.split(" ")[1]));
                continue;
            }
            if (input.startsWith("2")) {
                deque.offerLast(Integer.parseInt(input.split(" ")[1]));
                continue;
            }
            if (input.startsWith("3")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.pollFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                continue;
            }
            if (input.startsWith("4")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.pollLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                continue;
            }
            if (input.startsWith("5")) {
                sb.append(deque.size()).append("\n");
                continue;
            }
            if (input.startsWith("6")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
                continue;
            }
            if (input.startsWith("7")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                continue;
            }
            if (input.startsWith("8")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                continue;
            }
        }
        System.out.println(sb);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.startsWith("1")) {
                stack.offerLast(Integer.parseInt(input.split(" ")[1]));
                continue;
            }
            if (input.startsWith("2")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pollLast()).append("\n");
                }
                continue;
            }
            if (input.startsWith("3")) {
                sb.append(stack.size()).append("\n");
                continue;
            }
            if (input.startsWith("4")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
                continue;
            }
            if (input.startsWith("5")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}

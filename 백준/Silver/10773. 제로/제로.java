
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> stack = new ArrayDeque<>();

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                stack.pollLast();
            } else {
                stack.offerLast(input);
            }
        }
        int sum = stack.stream()
                       .mapToInt(Integer::intValue)
                       .sum();

        System.out.println(sum);
    }
}

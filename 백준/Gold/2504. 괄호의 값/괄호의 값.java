
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        Deque<String> stack = new ArrayDeque<>();

        int result = 0;
        int temp = 1;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                stack.offerLast(input[i]);
                temp = temp * 2;
                continue;
            }
            if (input[i].equals("[")) {
                stack.offerLast(input[i]);
                temp = temp * 3;
                continue;
            }
            if (input[i].equals(")")) {
                if (stack.isEmpty() || !stack.peekLast().equals("(")) {
                    result = 0;
                    break;
                }
                if (input[i - 1].equals("(")) {
                    result = result + temp;
                }
                stack.pollLast();
                temp = temp / 2;
            }
            if (input[i].equals("]")) {
                if (stack.isEmpty() || !stack.peekLast().equals("[")) {
                    result = 0;
                    break;
                }
                if (input[i - 1].equals("[")) {
                    result = result + temp;
                }
                stack.pollLast();
                temp = temp / 3;
            }
        }
        if (!stack.isEmpty()) {
            result = 0;
        }
        System.out.println(result);
        br.close();
    }
}

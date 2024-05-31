
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String input;
        while (true) {
            input = br.readLine();
            if (input.startsWith(".")) {
                break;
            }
            if (check(input)) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean check(String input) {
        if (!input.endsWith(".")) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArr = input.toCharArray();
        for (char a : charArr) {
            if (a == '(' || a == '[') {
                stack.offerLast(a);
            } else if (a == ')') {
                if (stack.isEmpty() || stack.pollLast() != '(') {
                    return false;
                }
            } else if (a == ']') {
                if (stack.isEmpty() || stack.pollLast() != '[') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}


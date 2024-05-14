
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] brackets = br.readLine().split("");
        int a = brackets.length;
        Deque<String> stack = new ArrayDeque<>();

        int result = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i].equals("(")) {
                stack.offerLast("(");
                continue;
            }
            if (brackets[i].equals(")")) {
                stack.pollLast();

                if (brackets[i - 1].equals("(")) {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}

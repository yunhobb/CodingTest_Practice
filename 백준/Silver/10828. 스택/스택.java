
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] commands = input.split(" ");

            if (commands[0].equals("push")) {
                stack.add(Integer.parseInt(commands[1]));
            }

            if (commands[0].equals("pop")) {
                if (stack.empty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            }

            if (commands[0].equals("size")) {
                sb.append(stack.size()).append("\n");
            }

            if (commands[0].equals("empty")) {
                if (stack.empty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0" ).append("\n");
                }
            }

            if (commands[0].equals("top")) {
                if (stack.empty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

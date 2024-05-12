import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();

        Integer n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] commands = input.split(" ");
            if (commands[0].equals("push")) {
                queue.offerLast(Integer.parseInt(commands[1]));
            }

            if (commands[0].equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.pollFirst()).append("\n");
                }
            }

            if (commands[0].equals("size")) {
                sb.append(queue.size()).append("\n");
            }

            if (commands[0].equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

            if (commands[0].equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peekFirst()).append("\n");
                }
            }

            if (commands[0].equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

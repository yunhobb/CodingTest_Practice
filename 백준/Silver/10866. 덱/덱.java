

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] commands = input.split(" ");

            if (commands[0].equals("push_front")) {
                deque.offerFirst(Integer.parseInt(commands[1]));
            }
            if (commands[0].equals("push_back")) {
                deque.offerLast(Integer.parseInt(commands[1]));
            }
            if (commands[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            }
            if (commands[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            }
            if (commands[0].equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            if (commands[0].equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
            if (commands[0].equals("front")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.getFirst()).append("\n");
                }
            }
            if (commands[0].equals("back")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.getLast()).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

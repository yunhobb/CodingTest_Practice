import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        Deque<Double> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] expressions = input.split("");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(br.readLine());
        }

        double result = 0;

        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                deque.offerLast(array[input.charAt(i) - 'A']);
            } else {
                if (!deque.isEmpty()) {
                    double first = deque.pollLast();
                    double second = deque.pollLast();
                    if (input.charAt(i) == '+') {
                        result = second + first;
                        deque.offerLast(result);
                    }
                    if (input.charAt(i) == '-') {
                        result = second - first;
                        deque.offerLast(result);
                    }
                    if (input.charAt(i) == '*') {
                        result = second * first;
                        deque.offerLast(result);
                    }
                    if (input.charAt(i) == '/') {
                        result = second / first;
                        deque.offerLast(result);
                    }
                }
            }
        }
        bw.write(String.format("%.2f", deque.pollLast()));
        bw.flush();
        bw.close();
        br.close();
    }
}
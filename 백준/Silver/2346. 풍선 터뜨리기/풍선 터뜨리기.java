
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloonLocation = new int[N];
        for (int i = 0; i < N; i++) {
            balloonLocation[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int moveValue = balloonLocation[0];

        for (int i = 1; i < N; i++) {
            deque.offer(new Balloon(i + 1, balloonLocation[i]));
        }

        while (!deque.isEmpty()) {
            if (moveValue > 0) {
                for (int i = 1; i < moveValue; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                Balloon next = deque.poll();
                moveValue = next.numValue;
                sb.append(next.index + " ");
            }
            else {
                for (int i = 1; i < -moveValue; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                Balloon next = deque.pollLast();
                moveValue = next.numValue;
                sb.append(next.index + " ");
            }

        }
        System.out.println(sb);
        br.close();
    }
}

class Balloon {
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}


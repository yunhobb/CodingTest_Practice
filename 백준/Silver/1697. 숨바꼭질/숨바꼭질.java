
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int result = bfs(n, k);
        System.out.println(result - 1);
    }

    private static int bfs(int start, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == k) {
                return visited[current];
            }


            if (current + 1 < visited.length && visited[current + 1] == 0) {
                queue.offer(current + 1);
                visited[current + 1] = visited[current] + 1;
            }

            if (current - 1 >= 0 && visited[current - 1] == 0) {
                queue.offer(current - 1);
                visited[current - 1] = visited[current] + 1;
            }

            if (current * 2 < visited.length && visited[current * 2] == 0) {
                queue.offer(current * 2);
                visited[current * 2] = visited[current] + 1;
            }
        }
        return -1;
    }
}
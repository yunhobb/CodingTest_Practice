
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n;
    static int m;
    static int[][] graph;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");

        n = Integer.parseInt(commands[0]);
        m = Integer.parseInt(commands[1]);

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        int result = bfs(0, 0);

        System.out.println(result);
    }

    public static int bfs(int startX, int startY) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(startX, startY));
        visited[startX][startY] = true;

        int count = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                Node current = queue.poll();
                int x = current.x;
                int y = current.y;

                if (x == n - 1 && y == m - 1) {
                    return count;
                }

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && graph[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new Node(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
            count++;
        }
        return -1;
    }

    private static class Node {

        int x;
        int y;

        public Node(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}

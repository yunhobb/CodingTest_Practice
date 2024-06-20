
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] graph;
    static int n;
    static List<Integer> results;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        results = new ArrayList<>();
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    results.add(bfs(i, j));
                }
            }
        }
        results.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        sb.append(results.size()).append("\n");
        for (int result : results) {
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static int bfs(int startX, int startY) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(startX, startY));
        visited[startX][startY] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int x = currentNode.x;
            int y = currentNode.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new Node(nx, ny));
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static class Node {

        int x, y;

        public Node(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}

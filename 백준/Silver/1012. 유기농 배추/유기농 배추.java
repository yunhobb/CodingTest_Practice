
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static StringBuilder results = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            // 그래프 세팅
            String[] commands = br.readLine().split(" ");
            int n = Integer.parseInt(commands[0]);
            int m = Integer.parseInt(commands[1]);
            int k = Integer.parseInt(commands[2]);
            graph = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                String[] inputs = br.readLine().split(" ");
                int x = Integer.parseInt(inputs[0]);
                int y = Integer.parseInt(inputs[1]);
                graph[x][y] = 1;
            }

            int count = 0;
            // BFS 시작
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (graph[x][y] == 1 && !visited[x][y]) {
                        bfs(x, y);
                        count++;
                    }
                }
            }
            results.append(count).append("\n");
        }
        System.out.println(results);
    }

    private static void bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            for (int i = 0; i < 4; i++) {
                int currentX = currentPoint.x + dx[i];
                int currentY = currentPoint.y + dy[i];
                if (currentX >= 0 && currentY >= 0 && currentX < graph.length && currentY < graph[0].length) {
                    if (graph[currentX][currentY] == 1 && !visited[currentX][currentY]) {
                        queue.offer(new Point(currentX, currentY));
                        visited[currentX][currentY] = true;
                    }
                }
            }
        }
    }

    // 상하좌우 검증을 위한 클래스
    private static class Point {
        int x;
        int y;

        public Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}
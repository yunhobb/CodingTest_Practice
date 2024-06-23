

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {2, 2, 1, 1, -2, -2, -1, -1};
    static int[] dy = {1, -1, 2, -2, 1, -1, 2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(br.readLine());
            graph = new int[l][l];
            visited = new boolean[l][l];
            String[] inputs = br.readLine().split(" ");
            int startX = Integer.parseInt(inputs[0]);
            int startY = Integer.parseInt(inputs[1]);
            String[] destination = br.readLine().split(" ");
            int destiX = Integer.parseInt(destination[0]);
            int destiY = Integer.parseInt(destination[1]);

            int result = bfs(l, startX, startY, destiX, destiY);
            System.out.println(result);
        }
    }

    public static int bfs(int l, int startX, int startY, int destiX, int destiY) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(startX, startY));
        visited[startX][startY] = true;
        graph[startX][startY] = 0;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == destiX && current.y == destiY) {
                return graph[current.x][current.y];
            }

            for (int i = 0; i < 8; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX >= 0 && nextX < l && nextY >= 0 && nextY < l && !visited[nextX][nextY]) {
                    queue.offer(new Point(nextX, nextY));
                    visited[nextX][nextY] = true;
                    graph[nextX][nextY] = graph[current.x][current.y] + 1;
                }
            }
        }
        return -1;  
    }

    private static class Point {
        int x;
        int y;

        public Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}
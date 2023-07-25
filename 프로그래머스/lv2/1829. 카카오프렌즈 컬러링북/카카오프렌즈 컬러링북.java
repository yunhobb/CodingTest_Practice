import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] visited = new boolean[m][n];
        int[] answer = new int[2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    int areaSize = bfs(i, j, picture, visited);
                    answer[0]++; 
                    answer[1] = Math.max(answer[1], areaSize); 
                }
            }
        }

        return answer;
    }

    public int bfs(int x, int y, int[][] picture, boolean[][] visited) {
        int areaSize = 0;
        int color = picture[x][y];
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x * picture[0].length + y);
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int position = queue.poll();
            int nx = position / picture[0].length;
            int ny = position % picture[0].length;
            areaSize++;

            for (int i = 0; i < 4; i++) {
                int nnx = nx + dx[i];
                int nny = ny + dy[i];

                if (nnx >= 0 && nnx < picture.length && nny >= 0 && nny < picture[0].length) {
                    if (picture[nnx][nny] == color && !visited[nnx][nny]) {
                        queue.offer(nnx * picture[0].length + nny);
                        visited[nnx][nny] = true;
                    }
                }
            }
        }

        return areaSize;
    }
}

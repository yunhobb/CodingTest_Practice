
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static List<List<Integer>> graph = new ArrayList<>();
    static int n, m, r;
    static boolean[] visited;
    static int[] results;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");
        n = Integer.parseInt(commands[0]);
        m = Integer.parseInt(commands[1]);
        r = Integer.parseInt(commands[2]);

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            int fromNode = Integer.parseInt(inputs[0]);
            int toNode = Integer.parseInt(inputs[1]);
            graph.get(fromNode).add(toNode);
            graph.get(toNode).add(fromNode);
        }

        for (int i = 1; i < n + 1; i++) {
            Collections.sort(graph.get(i));
        }
        visited = new boolean[n + 1];
        results = new int[n + 1];

        bfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            sb.append(results[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;
        int count = 1;
        results[startNode] = count++;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int i = 0; i < graph.get(currentNode).size(); i++) {
                int newNode = graph.get(currentNode).get(i);
                if (!visited[newNode]) {
                    visited[newNode] = true;
                    results[newNode] = count++;
                    queue.offer(newNode);
                }
            }
        }
    }
}

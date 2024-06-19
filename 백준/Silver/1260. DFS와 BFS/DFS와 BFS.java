
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static int node, edge, startNode;
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visitedDFS;
    static boolean[] visitedBFS;
    static StringBuilder sbDFS = new StringBuilder();
    static StringBuilder sbBFS = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");
        node = Integer.parseInt(commands[0]);
        edge = Integer.parseInt(commands[1]);
        startNode = Integer.parseInt(commands[2]);

        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            String[] inputs = br.readLine().split(" ");
            int fromNode = Integer.parseInt(inputs[0]);
            int toNode = Integer.parseInt(inputs[1]);
            graph.get(fromNode).add(toNode);
            graph.get(toNode).add(fromNode);
        }

        for (int i = 1; i <= node; i++) {
            Collections.sort(graph.get(i));
        }

        visitedDFS = new boolean[node + 1];
        visitedBFS = new boolean[node + 1];

        dfs(startNode);
        bfs(startNode);

        System.out.println(sbDFS.toString().trim());
        System.out.println(sbBFS.toString().trim());
    }

    private static void dfs(int currentNode) {
        visitedDFS[currentNode] = true;
        sbDFS.append(currentNode).append(" ");

        for (int newNode : graph.get(currentNode)) {
            if (!visitedDFS[newNode]) {
                dfs(newNode);
            }
        }
    }

    private static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visitedBFS[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            sbBFS.append(currentNode).append(" ");

            for (int newNode : graph.get(currentNode)) {
                if (!visitedBFS[newNode]) {
                    queue.offer(newNode);
                    visitedBFS[newNode] = true;
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static int node, edge;
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] check;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        check = new int[node + 1];

        for (int i = 0; i < node + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            String[] inputs = br.readLine().split(" ");
            int fromNode = Integer.parseInt(inputs[0]);
            int toNode = Integer.parseInt(inputs[1]);
            graph.get(fromNode).add(toNode);
            graph.get(toNode).add(fromNode);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        int result =0;
        dfs(1);
        for (int a : check) {
            if (a != 0) {
                result++;
            }
        }
        // index 구분을 위한 0번쨰 인덱스는 제거
        System.out.println(result-1);
    }

    private static void dfs(int node) {
        check[node] = count;
        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if (check[newNode] == 0) {
                count++;
                dfs(newNode);
            }
        }
    }
}

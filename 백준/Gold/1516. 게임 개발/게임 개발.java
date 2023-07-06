import java.util.*;
import java.io.*;

public class Main {
    static int[] time; // 각 건물의 건설 시간
    static int[] indegree; // 각 건물의 선행 건물 수
    static int[] result; // 각 건물의 완성 시간
    static ArrayList<Integer>[] graph; // 각 건물의 선행 건물 그래프

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        time = new int[N + 1];
        indegree = new int[N + 1];
        result = new int[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 건물 정보 입력
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                int preBuilding = Integer.parseInt(st.nextToken());
                if (preBuilding == -1) break;
                graph[preBuilding].add(i);
                indegree[i]++;
            }
        }

        topologySort(N);

        for (int i = 1; i <= N; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void topologySort(int N) {
        Queue<Integer> queue = new LinkedList<>();

        // 선행 건물이 없는 건물을 큐에 삽입
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                result[i] = time[i];
            }
        }

        // 큐에서 건물을 하나씩 꺼내면서 처리
        while (!queue.isEmpty()) {
            int building = queue.poll();

            // 선행 건물이 완료된 시간과 현재 건물의 시간을 더한 값을 결과에 저장
            for (int nextBuilding : graph[building]) {
                result[nextBuilding] = Math.max(result[nextBuilding], result[building] + time[nextBuilding]);

                // 선행 건물이 모두 완료되면 큐에 삽입
                if (--indegree[nextBuilding] == 0) {
                    queue.offer(nextBuilding);
                }
            }
        }
    }
}

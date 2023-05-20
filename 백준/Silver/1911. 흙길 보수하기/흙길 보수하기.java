import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 웅덩이 갯수
        int L = Integer.parseInt(st.nextToken()); // 널빤지 길이

        int[][] arr = new int[N][2]; // 물웅덩이의 시작, 끝 위치
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 시작 위치
            arr[i][1] = Integer.parseInt(st.nextToken()); // 끝 위치
        }

        // 물 웅덩이 정렬
        // 시작위치가 같으면 끝자리 오름차순
        // 시작 위치를 기준으로 오름차순
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int ans = 0; // 널빤지 갯수
        int range = 0; // 널빤지를 웅덩이에 덮엇을때, 덮을 수 있는 범위

        for (int i = 0; i < N; i++) {
            if (arr[i][0] > range) { // 시작위치가 범위보다 클 경우
                range = arr[i][0];
            }
            if (arr[i][1] >= range) { // 끝위치가 범위보다 클 경우
                while (arr[i][1] > range) {
                    range += L;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}

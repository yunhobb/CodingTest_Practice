
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] arr = new long[101];  // int 대신 long을 사용하여 큰 숫자를 처리

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 초기값 설정
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static long dp(int input) {
        if (arr[input] != 0) {
            return arr[input];
        }
        return arr[input] = dp(input - 1) + dp(input - 5);
    }
}
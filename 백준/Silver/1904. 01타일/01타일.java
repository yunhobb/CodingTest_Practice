
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] dp = new int[1000001];;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        // -1 로 초기화
        for(int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(tile(t));

    }

    public static int tile(int n) {

        if(dp[n] == -1) {
            // 메오이제이션
            dp[n] = (tile(n - 1) + tile((n - 2))) % 15746;
        }
        return dp[n];
    }
}

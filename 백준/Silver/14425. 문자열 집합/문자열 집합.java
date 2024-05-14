
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hads = br.readLine().split(" ");

        int n = Integer.parseInt(hads[0]);
        int m = Integer.parseInt(hads[1]);
        Map<String, Integer> map = new HashMap<>();

        int result = 0;
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }
        for (int j = 0; j < m; j++) {
            if (map.containsKey(br.readLine())) {
                result++;
            }
        }
        System.out.println(result);
    }
}

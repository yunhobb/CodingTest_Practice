
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        int maxNum = 0;

        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            map.put(n, i);
            if (n > maxNum) {
                maxNum = n;
            }
        }

        System.out.println(maxNum);
        System.out.println(map.get(maxNum));
        br.close();
    }
}

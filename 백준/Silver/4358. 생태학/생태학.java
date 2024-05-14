import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        long count = 0;
        String input;
        while ((input = br.readLine()) != null) { // 입력이 null이면 종료
            map.put(input, map.getOrDefault(input, 0) + 1);
            count++;
        }

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys); // 키를 알파벳 순으로 정렬

        for (String key : keys) {
            System.out.print(key + " ");
            System.out.println(String.format("%.4f", (double) map.get(key) / count * 100)); // 비율을 백분율로 출력
        }
    }
}
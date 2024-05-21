
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
        String[] inputs = br.readLine().split("");
        Map<String, Integer> map = new HashMap<>();

        for (String input : inputs) {
            map.put(input.toUpperCase(), map.getOrDefault(input.toUpperCase(), 0) + 1);
        }

        int maxValue = Collections.max(map.values());

        List<String> maxKeys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKeys.add(entry.getKey());
            }
        }
        if (maxKeys.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxKeys.get(0).toUpperCase());
        }
    }
}


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
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            if (map.containsKey(inputs[0])) {
                map.remove(inputs[0]);
            } else {
                map.put(inputs[0], inputs[1]);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] commands = br.readLine().split(" ");
        int n = Integer.parseInt(commands[0]);
        int m = Integer.parseInt(commands[1]);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.length() >= m) {
                list.add(input);
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String a : list) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, new Comparator<>() {
            @Override
            public int compare(final String o1, final String o2) {
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                if (Integer.compare(o1.length(), o2.length()) != 0) {
                    return Integer.compare(o2.length(), o1.length());
                }
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }
}

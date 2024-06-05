
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        int addValues = 0;
        for (Integer value : list) {
            addValues = addValues + value;
        }
        sb.append(Math.round((double) addValues / n)).append("\n");

        sb.append(list.get(n / 2)).append("\n");

        sb.append(findSecondMode(list)).append("\n");

        sb.append(list.get(list.size() - 1) - list.get(0));

        System.out.println(sb);
    }

    public static int findSecondMode(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : list) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        int maxValue = Collections.max(map.values());

        List<Integer> maxValuekeys = map.entrySet().stream()
                                        .filter(entry -> entry.getValue().equals(maxValue))
                                        .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());
        Collections.sort(maxValuekeys);
        
        if (maxValuekeys.size() == 1) {
            return maxValuekeys.get(0);
        } else {
            return maxValuekeys.get(1);
        }
    }
}

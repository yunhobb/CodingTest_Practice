
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            List<Integer> innerList = new ArrayList<>();
            innerList.add(Integer.parseInt(inputs[0]));
            innerList.add(Integer.parseInt(inputs[1]));
            list.add(innerList);
        }

        list.sort((x1, x2) -> {
            int cmp = Integer.compare(x1.get(0), x2.get(0));
            if (cmp == 0) {
                return Integer.compare(x1.get(1), x2.get(1));
            }
            return cmp;
        });

        StringBuilder sb = new StringBuilder();
        for (List<Integer> a : list) {
            for (Integer b : a) {
                sb.append(b + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

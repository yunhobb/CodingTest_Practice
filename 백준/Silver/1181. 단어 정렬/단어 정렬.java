
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list = list.stream().distinct().collect(Collectors.toList());

        list.sort((o1, o2) -> {
            int cmp = Integer.compare(o1.length(), o2.length());
            if (cmp == 0) {
                return o1.compareTo(o2);
            }
            return cmp;
        });
        for (String a : list) {
            System.out.println(a);
        }
    }
}

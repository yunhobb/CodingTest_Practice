
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list.sort((o1, o2) -> {
            int a = Integer.parseInt(o1.split(" ")[0]);
            int b = Integer.parseInt(o2.split(" ")[0]);
            return Integer.compare(a, b);
        });

        for (String a : list) {
            System.out.println(a);
        }
    }
}

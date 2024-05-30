
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");
        int n = Integer.parseInt(commands[0]);
        int m = Integer.parseInt(commands[1]);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        String[] nInput = br.readLine().split(" ");
        String[] mInput = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(nInput[i]));
        }
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(mInput[i]));
        }

        int count = 0;

        for (int aValue : a) {
            if (b.contains(aValue)) {
                count++;
            }
        }
        System.out.println(n + m - 2 * count);
    }
}

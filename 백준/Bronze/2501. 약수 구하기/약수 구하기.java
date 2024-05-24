
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        List<Integer> dividedList = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                dividedList.add(i);
            }
            i++;
        }
        if (dividedList.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(dividedList.get(k - 1));
        }
    }
}

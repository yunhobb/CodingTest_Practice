
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> nameSet = new HashSet<>();
        nameSet.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");

            if (nameSet.contains(inputs[0]) || nameSet.contains(inputs[1])) {
                nameSet.add(inputs[0]);
                nameSet.add(inputs[1]);
            }
        }
        System.out.println(nameSet.size());
    }
}

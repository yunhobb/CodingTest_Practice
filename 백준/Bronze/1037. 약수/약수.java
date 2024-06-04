
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (String input : inputs) {
            list.add(Integer.parseInt(input));
        }

        Collections.sort(list);

        System.out.println(list.get(0) * list.get(list.size() - 1));
    }
}

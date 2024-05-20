
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        List<String> testcases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            testcases.add(br.readLine());
        }

        for (String testcase : testcases) {
            String[] input = testcase.split("");
            sb.append(input[0]).append(input[input.length-1]).append("\n");
        }

        System.out.println(sb);
    }
}

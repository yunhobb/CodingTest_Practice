
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);

        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");
        for (String input : inputs) {
            if (Integer.parseInt(input) < x) {
                sb.append(input + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}

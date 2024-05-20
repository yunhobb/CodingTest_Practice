
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] inputs = br.readLine().split(" ");
            String[] literals = inputs[1].split("");

            for (String literal : literals) {
                for(int j = 0; j < Integer.parseInt(inputs[0]); j++){
                    sb.append(literal);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

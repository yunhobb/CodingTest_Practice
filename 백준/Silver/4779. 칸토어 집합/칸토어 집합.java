
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder result = new StringBuilder();

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3, n);
            result.append(canto(length)).append("\n");
        }
        System.out.println(result);
    }

    public static String canto(int length) {
        if (length == 1) {
            return "-";
        }
        int partLength = length / 3;
        String part = canto(partLength);
        StringBuilder sb = new StringBuilder();
        sb.append(part);
        for (int i = 0; i < partLength; i++) {
            sb.append(" ");
        }
        sb.append(part);
        return sb.toString();
    }
}
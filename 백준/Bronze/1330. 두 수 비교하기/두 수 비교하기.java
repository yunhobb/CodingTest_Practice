import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (a > b) {
            System.out.println(">");
            return;
        }
        if (a < b) {
            System.out.println("<");
            return;
        }
        if (a == b) {
            System.out.println("==");
            return;
        }
    }
}
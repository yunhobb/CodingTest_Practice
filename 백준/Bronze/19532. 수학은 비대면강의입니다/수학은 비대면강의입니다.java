
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);
        int e = Integer.parseInt(inputs[4]);
        int f = Integer.parseInt(inputs[5]);

        boolean found = false;

        int x = 0;
        int y = 0;
        for (x = -999; x <= 999; x++) {
            for (y = -999; y <= 999; y++) {
                if (a * x + b * y == c) {
                    if (d * x + e * y == f) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println(x + " " + y);
    }
}

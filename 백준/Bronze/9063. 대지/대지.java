
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(0);
            return;
        }

        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int inputX = Integer.parseInt(inputs[0]);
            int inputY = Integer.parseInt(inputs[1]);
            
            if (inputX > maxX) {
                maxX = inputX;
            }

            if (inputX < minX) {
                minX = inputX;
            }

            if (inputY > maxY) {
                maxY = inputY;
            }

            if (inputY < minY) {
                minY = inputY;
            }

        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}

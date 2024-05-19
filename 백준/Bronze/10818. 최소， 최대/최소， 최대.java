
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String[] inputs = br.readLine().split(" ");

        int maxNum = Integer.parseInt(inputs[0]);
        int minNum = Integer.parseInt(inputs[0]);

        for (String input : inputs) {
            if (Integer.parseInt(input) > maxNum) {
                maxNum = Integer.parseInt(input);
            }
            if (Integer.parseInt(input) < minNum) {
                minNum = Integer.parseInt(input);
            }
        }
        System.out.print(minNum + " " + maxNum);
    }
}

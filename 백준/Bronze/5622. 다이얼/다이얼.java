
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");

        int result = 0;
        for (String input : inputs) {
            int unicode = input.charAt(0);
            if (unicode < 68) {
                result = result + 3;
            } else if (unicode < 71) {
                result = result + 4;
            } else if (unicode < 74) {
                result = result + 5;
            } else if (unicode < 77) {
                result = result + 6;
            } else if (unicode < 80) {
                result = result + 7;
            } else if (unicode < 84) {
                result = result + 8;
            } else if (unicode < 87) {
                result = result + 9;
            } else {
                result = result + 10;
            }
        }
        System.out.println(result);
    }
}

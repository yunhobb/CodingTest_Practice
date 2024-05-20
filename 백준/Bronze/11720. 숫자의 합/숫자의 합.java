

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split("");

        int result = 0;
        for (String input : inputs) {
            result = result + Integer.parseInt(input);
        }

        System.out.println(result);
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : croatianAlphabets) {
            while (input.contains(pattern)) {
                input = input.replaceFirst(pattern, "*");
            }
        }

        int result = input.length();

        System.out.println(result);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int inputSize = input.length();

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= inputSize; i++) {
            for (int j = 0; j < i; j++) {
                set.add(input.substring(j, i));
            }
        }
        System.out.println(set.size());
    }
}

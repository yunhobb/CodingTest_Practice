
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = Arrays.stream(br.readLine().split(""))
                              .map(Integer::parseInt)
                              .sorted(Comparator.reverseOrder())
                              .map(String::valueOf)
                              .collect(Collectors.joining());

        System.out.println(result);
    }
}

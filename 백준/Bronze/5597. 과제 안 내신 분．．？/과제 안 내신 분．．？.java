
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            numbers.add(i);
        }

        for (int j = 0; j < 28; j++) {
            Integer input = Integer.parseInt(br.readLine());
            numbers.remove(input);
        }

        numbers.sort(Comparator.naturalOrder());
//        Collections.sort(numbers);
//        numbers.sort(Comparator.reverseOrder());
//        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(numbers.get(0) + "\n" + numbers.get(1));
    }
}

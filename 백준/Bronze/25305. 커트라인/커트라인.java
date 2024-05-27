
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");
        int n = Integer.parseInt(commands[0]);
        int k = Integer.parseInt(commands[1]);

        String[] inputs = br.readLine().split(" ");

        List<Integer> list = Arrays.stream(inputs)
                                   .map(Integer::parseInt)
                                   .sorted(Comparator.reverseOrder())
                                   .collect(Collectors.toList());

        System.out.println(list.get(k-1));
    }
}

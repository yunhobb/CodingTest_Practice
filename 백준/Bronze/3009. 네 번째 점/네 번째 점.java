
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputFirst = br.readLine().split(" ");
        String[] inputSecond = br.readLine().split(" ");
        String[] inputThird = br.readLine().split(" ");

        int x1 = Integer.parseInt(inputFirst[0]);
        int x2 = Integer.parseInt(inputSecond[0]);
        int x3 = Integer.parseInt(inputThird[0]);

        int y1 = Integer.parseInt(inputFirst[1]);
        int y2 = Integer.parseInt(inputSecond[1]);
        int y3 = Integer.parseInt(inputThird[1]);

        int x4 = 0;
        int y4 = 0;

        if (x1 == x2) {
            x4 = x3;

        } else if (x1 == x3) {
            x4 = x2;
        } else if (x2 == x3) {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else if (y2 == y3) {
            y4 = y1;
        }

        System.out.println(x4 + " " + y4);
    }
}

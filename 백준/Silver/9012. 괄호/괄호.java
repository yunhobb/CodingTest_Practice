
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Integer n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] ps = input.split("");
            int balance = 0;
            boolean isBalance = true;
            for (String s : ps) {
                if (s.equals("(")) {
                    balance++;
                }
                if (s.equals(")")) {
                    balance--;
                }
                if (balance < 0) {
                    sb.append("NO\n");
                    isBalance = false;
                    break;
                }
            }
            if (isBalance) {
                if (balance == 0) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int price = Integer.parseInt(br.readLine());
            calculateCoin(price, sb);
        }

        System.out.println(sb);
    }

    public static void calculateCoin(int price, StringBuilder sb) {
        int quarterCount = price / 25;
        price %= 25;

        int dimeCount = price / 10;
        price %= 10;

        int nickelCount = price / 5;
        price %= 5;

        int pennyCount = price;

        sb.append(quarterCount + " ").append(dimeCount + " ").append(nickelCount + " ").append(pennyCount + " ")
          .append("\n");
    }

    // 쿼터 25
    // 다임 10
    // 니켈 5
    // 페니 1
}

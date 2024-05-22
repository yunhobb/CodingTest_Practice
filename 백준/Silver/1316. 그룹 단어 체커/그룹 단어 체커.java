
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (groupWordChecker(input)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean groupWordChecker(String word) {
        boolean[] isExistAlphabets = new boolean[26];
        int prev = 0;
        String[] letters = word.split("");

        for (String letter : letters) {
            int now = letter.charAt(0);

            if (prev != now) {
                if (isExistAlphabets[now - 'a'] == false) {
                    isExistAlphabets[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

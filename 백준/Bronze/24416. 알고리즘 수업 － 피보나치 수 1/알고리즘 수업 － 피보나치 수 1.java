
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int countRe = 1;
    static int countDp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fibRe(n);
        fibDp(n);

        System.out.println(countRe + " " + countDp);

    }

    public static int fibRe(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        countRe++;
        return (fibRe(n - 1) + fibRe((n - 2)));

    }

    public static int fibDp(int n) {
        if (n == 1 || n == 2) {
            countDp = 1;
            return 1;
        }

        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            countDp++;
        }
        return f[n];
    }
}

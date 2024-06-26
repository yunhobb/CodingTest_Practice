
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 최소 값이 되려면 -가 나온뒤 +가 나올때 까까지 계속 값을 하는게 좋음

    private static final char PLUS = '+';
    private static final char MINUS = '-';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splitWithMinus = br.readLine().split("-");

        int result = 0;

        for (int i = 0; i < splitWithMinus.length; i++) {
            int temp = 0;

            //regex에서 +는 "앞에 요소를 가져야 한다"라는 의미를 가짐 따라서
            // 이스케이프 문자를 붙여야지 +로 나눌 수 있음
            String[] spliteWithPlus = splitWithMinus[i].split("\\+");

            for (int j = 0; j < spliteWithPlus.length; j++) {
                temp = temp + Integer.parseInt(spliteWithPlus[j]);
            }

            if (i == 0) {
                result = temp;
            } else {
                result -= temp;
            }
        }

        System.out.println(result);
    }
}

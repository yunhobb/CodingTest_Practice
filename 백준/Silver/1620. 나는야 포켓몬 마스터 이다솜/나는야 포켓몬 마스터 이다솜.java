
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(commands[0]);
        int m = Integer.parseInt(commands[1]);

        Map<Integer, String> indexMap = new HashMap<>();
        Map<String, Integer> nameMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            indexMap.put(i, name);
            nameMap.put(name, i);
        }

        for (int j = 0; j < m; j++) {
            String question = br.readLine();
            if (question.chars().allMatch(Character::isDigit)) { // 숫자면 조건문 내부로~
                String answer = indexMap.get(Integer.parseInt(question));
                sb.append(answer).append("\n");
            }
            if (!question.chars().allMatch(Character::isDigit)) { // 글자면 조건문 내부로~
                String answer = String.valueOf(nameMap.get(question));
                sb.append(answer).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}

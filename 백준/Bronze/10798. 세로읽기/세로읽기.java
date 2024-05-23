
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < inputs.length; j++) {
                matrix[i][j] = inputs[j].charAt(0);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[j][i] != '\0') {
                    sb.append(matrix[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}

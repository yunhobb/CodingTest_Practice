
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Double> scores = new ArrayList<>();
        List<Double> editScores = new ArrayList<>();

        String[] inputs = br.readLine().split(" ");
        for (String input : inputs) {
            scores.add(Double.parseDouble(input));
        }

        scores.sort(Comparator.reverseOrder());

        for (Double score : scores) {
            editScores.add(score / scores.get(0) * 100);
        }

        double sumEditScore = 0;

        for (Double editScore : editScores) {
            sumEditScore = sumEditScore + editScore;
        }

        System.out.println(sumEditScore / n);
    }
}

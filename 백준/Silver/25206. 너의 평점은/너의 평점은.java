
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalScore = 0;
        double multiplyScoreGrade = 0;

        for (int i = 0; i < 20; i++) {
            String[] inputs = br.readLine().split(" ");
            double score = Double.parseDouble(inputs[1]);
            String grade = inputs[2];

            if (!grade.equals("P")) {
                double gradeValue = gradeToScore(grade);
                totalScore += score;
                multiplyScoreGrade += score * gradeValue;
            }
        }

        System.out.printf("%.4f%n", multiplyScoreGrade / totalScore);
    }

    public static double gradeToScore(String grade) {
        if (grade.equals("A+")) {
            return 4.5;
        }
        if (grade.equals("A0")) {
            return 4.0;
        }
        if (grade.equals("B+")) {
            return 3.5;
        }
        if (grade.equals("B0")) {
            return 3.0;
        }
        if (grade.equals("C+")) {
            return 2.5;
        }
        if (grade.equals("C0")) {
            return 2.0;
        }
        if (grade.equals("D+")) {
            return 1.5;
        }
        if (grade.equals("D0")) {
            return 1.0;
        }
        if (grade.equals("F")) {
            return 0.0;
        }
        return 0.0;
    }
}

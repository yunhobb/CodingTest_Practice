
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] expectedCheesePiecesNum = br.readLine().split(" ");

        int[] cheesePiecesNum = new int[]{1, 1, 2, 2, 2, 8};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expectedCheesePiecesNum.length; i++) {
            int lackPiece = Integer.parseInt(expectedCheesePiecesNum[i]) - cheesePiecesNum[i];
            sb.append(-lackPiece + " ");
        }
        System.out.println(sb);
    }
}

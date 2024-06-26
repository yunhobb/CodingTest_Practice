
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> distanceList = new ArrayList<>();
        String[] distances = br.readLine().split(" ");
        for (String distance : distances) {
            distanceList.add(Integer.parseInt(distance));
        }

        List<Integer> costList = new ArrayList<>();
        String[] costs = br.readLine().split(" ");
        for (String cost : costs) {
            costList.add(Integer.parseInt(cost));
        }

        int result = 0;
        int minCost = costList.get(0);

        for (int i = 0; i < distanceList.size(); i++) {
            if (costList.get(i) < minCost) {
                minCost = costList.get(i);
            }
            result += minCost * distanceList.get(i); 
        }

        System.out.println(result);
    }
}

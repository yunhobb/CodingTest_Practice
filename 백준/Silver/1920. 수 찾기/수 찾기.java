
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nArr = new int[n];
        String[] nInputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(nInputs[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];
        String[] mInputs = br.readLine().split(" ");
        for (int j = 0; j < m; j++) {
            mArr[j] = Integer.parseInt(mInputs[j]);
        }

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();
        for (int i : mArr) {
            sb.append(binarySearch(nArr, i)).append("\n");
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int coin = Integer.parseInt(br.readLine());  //거스름돈
		int res = 0;  //동전 개수
				
		while(coin >= 0) {
			if (coin % 5 == 0) {
				System.out.println(res + (coin / 5));
				break;
			}
			coin -= 2;
			res += 1;
		}
		if(coin < 0) {
			System.out.println(-1);
		}
	}
}
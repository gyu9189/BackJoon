package stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr1.length; i++) {
            int cnt = Integer.parseInt(st.nextToken());
           if(cnt < arr1[i]) {
               System.out.print(arr1[i] - cnt + " ");
           } else if (cnt > arr1[i]) {
               System.out.print("-" + (cnt - arr1[i]) + " ");
           } else {
               System.out.print("0 ");
           }
        }
    }
}

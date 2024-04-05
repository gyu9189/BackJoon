package stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon9086 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] strArr = new String[num];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        for (String str : strArr) {
            System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)));
        }
    }
}

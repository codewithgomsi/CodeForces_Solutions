import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String firstLine = br.readLine();
        if (firstLine == null || firstLine.trim().isEmpty()) return;
        
        int n = Integer.parseInt(firstLine.trim());
        int[] count = new int[5];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            count[s]++;
        }
        
        int taxis = 0;
        
        // Step 1: Every group of 4 gets its own taxi
        taxis += count[4];
        
        // Step 2: Every group of 3 gets a taxi and can pair with one group of 1
        taxis += count[3];
        count[1] = Math.max(0, count[1] - count[3]);
        
        // Step 3: Groups of 2 can pair with each other (2 + 2 = 4)
        taxis += count[2] / 2;
        count[2] %= 2;
        
        // If there's 1 remaining group of 2, it gets a taxi and can take up to 2 groups of 1
        if (count[2] > 0) {
            taxis += 1;
            count[1] = Math.max(0, count[1] - 2);
        }
        
        // Step 4: Pack remaining groups of 1 (up to 4 per taxi)
        if (count[1] > 0) {
            taxis += (count[1] + 3) / 4;
        }
        
        System.out.println(taxis);
    }
}
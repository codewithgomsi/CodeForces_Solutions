import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        
        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            line = reader.readLine();
            if (line == null) break;
            tokenizer = new StringTokenizer(line);
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());
            
            String s = reader.readLine();
            
            // Count the number of '1's in each remainder class modulo k
            int[] counts = new int[k];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    counts[i % k]++;
                }
            }
            
            // If any remainder class has an odd number of '1's, it's impossible
            boolean possible = true;
            for (int r = 0; r < k; r++) {
                if (counts[r] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                output.append("YES
");
            } else {
                output.append("NO
");
            }
        }
        System.out.print(output);
    }
}
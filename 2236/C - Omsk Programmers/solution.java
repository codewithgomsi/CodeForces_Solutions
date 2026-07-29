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
            long a = Long.parseLong(tokenizer.nextToken());
            long b = Long.parseLong(tokenizer.nextToken());
            long x = Long.parseLong(tokenizer.nextToken());
            
            output.append(solve(a, b, x)).append("
");
        }
        System.out.print(output);
    }
    
    // Finds minimum operations to make a and b equal
    private static long solve(long a, long b, long x) {
        long minOps = Math.abs(a - b); // Cost if we only use additions
        
        long countA = 0;
        long currentA = a;
        
        // Loop through all possible divisions of 'a'
        while (true) {
            long countB = 0;
            long currentB = b;
            
            // Loop through all possible divisions of 'b'
            while (true) {
                // Cost = total divisions done + additions needed to bridge the remaining gap
                long currentOps = countA + countB + Math.abs(currentA - currentB);
                minOps = Math.min(minOps, currentOps);
                
                if (currentB == 0) break;
                currentB /= x;
                countB++;
            }
            
            if (currentA == 0) break;
            currentA /= x;
            countA++;
        }
        
        return minOps;
    }
}
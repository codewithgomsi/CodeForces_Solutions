import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;
 
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
 
        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null) break;
                st = new StringTokenizer(s);
            }
            int n = Integer.parseInt(st.nextToken());
 
            while (st == null || !st.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null) break;
                st = new StringTokenizer(s);
            }
 
            long prefixSum = 0;
            long maxPossibleHeight = Long.MAX_VALUE;
 
            for (int i = 1; i <= n; i++) {
                long val = Long.parseLong(st.nextToken());
                prefixSum += val;
 
                // The leveling height cannot exceed the localized maximum average height up to index i
                long currentAvg = prefixSum / i;
                maxPossibleHeight = Math.min(maxPossibleHeight, currentAvg);
 
                out.print(maxPossibleHeight + (i == n ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}
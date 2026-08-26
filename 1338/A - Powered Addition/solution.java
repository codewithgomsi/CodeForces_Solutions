import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            
            long maxVal = a[0];
            long maxDiff = 0;
            
            for (int i = 1; i < n; i++) {
                if (a[i] < maxVal) {
                    maxDiff = Math.max(maxDiff, maxVal - a[i]);
                } else {
                    maxVal = a[i];
                }
            }
            
            // Find the smallest T such that 2^T - 1 >= maxDiff
            if (maxDiff == 0) {
                sb.append(0).append("
");
            } else {
                int ans = 64 - Long.numberOfLeadingZeros(maxDiff);
                sb.append(ans).append("
");
            }
        }
        
        System.out.print(sb);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int n = Integer.parseInt(line.trim());
        long[] a = new long[n];
        long sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
            sum += a[i];
        }
        
        if (sum <= 1) {
            System.out.println(-1);
            return;
        }
        
        // Find prime factors of total sum
        List<Long> primes = new ArrayList<>();
        long temp = sum;
        for (long d = 2; d * d <= temp; d++) {
            if (temp % d == 0) {
                primes.add(d);
                while (temp % d == 0) {
                    temp /= d;
                }
            }
        }
        if (temp > 1) {
            primes.add(temp);
        }
        
        long ans = Long.MAX_VALUE;
        
        for (long p : primes) {
            long currentCost = 0;
            long rem = 0;
            for (int i = 0; i < n; i++) {
                rem = (rem + a[i]) % p;
                currentCost += Math.min(rem, p - rem);
            }
            ans = Math.min(ans, currentCost);
        }
        
        System.out.println(ans);
    }
}
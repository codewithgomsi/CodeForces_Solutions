import java.util.*;
 
public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), d = sc.nextInt();
        
        long[][] dp = new long[n+1][2];
        dp[0][0] = 1;
        
        for (int i = 0; i < n; i++) {
            for (int w = 1; w <= k; w++) {
                if (i + w <= n) {
                    if (w >= d) {
                        dp[i+w][1] = (dp[i+w][1] + dp[i][0] + dp[i][1]) % MOD;
                    } else {
                        dp[i+w][0] = (dp[i+w][0] + dp[i][0]) % MOD;
                        dp[i+w][1] = (dp[i+w][1] + dp[i][1]) % MOD;
                    }
                }
            }
        }
        
        System.out.println(dp[n][1]);
    }
}
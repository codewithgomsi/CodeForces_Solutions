import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ones = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) ones++;
        }
        
        int maxGain = Integer.MIN_VALUE, cur = 0;
        for (int i = 0; i < n; i++) {
            int val = (a[i] == 0 ? 1 : -1);
            cur = Math.max(val, cur + val);
            maxGain = Math.max(maxGain, cur);
        }
        
        System.out.println(ones + maxGain);
    }
}
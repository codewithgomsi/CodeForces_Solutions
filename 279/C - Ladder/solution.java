import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        
        int[] inc = new int[n+1];
        int[] dec = new int[n+1];
        
        // Precompute inc[]
        inc[n] = n;
        for (int i = n-1; i >= 1; i--) {
            if (a[i] <= a[i+1]) inc[i] = inc[i+1];
            else inc[i] = i;
        }
        
        // Precompute dec[]
        dec[n] = n;
        for (int i = n-1; i >= 1; i--) {
            if (a[i] >= a[i+1]) dec[i] = dec[i+1];
            else dec[i] = i;
        }
        
        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            int peak = inc[l]; // farthest increasing point
            if (dec[peak] >= r) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
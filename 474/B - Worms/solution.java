import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prefix = new int[n];
        
        prefix[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + sc.nextInt();
        }
        
        int q = sc.nextInt();
        while (q-- > 0) {
            int worm = sc.nextInt();
            int idx = Arrays.binarySearch(prefix, worm);
            if (idx < 0) idx = -idx - 1;
            System.out.println(idx + 1);
        }
    }
}
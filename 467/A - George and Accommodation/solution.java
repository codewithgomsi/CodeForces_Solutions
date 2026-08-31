import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int available = 0;
        
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // current occupants
            int q = sc.nextInt(); // capacity
            if (q - p >= 2) {
                available++;
            }
        }
        
        System.out.println(available);
    }
}
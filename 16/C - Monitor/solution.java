import java.util.Scanner;
 
public class Main {
    // Helper method to calculate GCD
    public static long gcd(long u, long v) {
        while (v != 0) {
            long temp = v;
            v = u % v;
            u = temp;
        }
        return u;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextLong()) return;
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        
        // Simplify ratio x:y
        long g = gcd(x, y);
        x /= g;
        y /= g;
        
        // Find maximum multiplier k
        long k = Math.min(a / x, b / y);
        
        if (k == 0) {
            System.out.println("0 0");
        } else {
            System.out.println((k * x) + " " + (k * y));
        }
        
        scanner.close();
    }
}
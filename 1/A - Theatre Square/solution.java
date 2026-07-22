import java.util.Scanner;
 
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        
        // Calculate flagstones needed for length and width
        long lengthFlagstones = (n + a - 1) / a;
        long widthFlagstones = (m + a - 1) / a;
        
        // Total flagstones is the product of both sides
        long totalFlagstones = lengthFlagstones * widthFlagstones;
        
        // Print the final result
        System.out.println(totalFlagstones);
        
        sc.close();
    }
}
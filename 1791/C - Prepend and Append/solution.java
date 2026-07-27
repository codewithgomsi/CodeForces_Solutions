import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int left = 0;
            int right = n - 1;
            
            // Shrink from both ends while characters are opposite
            while (left <= right && s.charAt(left) != s.charAt(right)) {
                left++;
                right--;
            }
            
            // Total remaining elements
            System.out.println(right - left + 1);
        }
        scanner.close();
    }
}
import java.util.Scanner;
 
public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the initial total amount of money
        int n = sc.nextInt();
        
        int ans = 0;
        
        // Use 100 dollar bills
        ans += n / 100;
        n %= 100;
        
        // Use 20 dollar bills
        ans += n / 20;
        n %= 20;
        
        // Use 10 dollar bills
        ans += n / 10;
        n %= 10;
        
        // Use 5 dollar bills
        ans += n / 5;
        n %= 5;
        
        // The remaining amount is paid in 1 dollar bills
        ans += n;
        
        // Print total bills used
        System.out.println(ans);
        
        sc.close();
    }
}
 
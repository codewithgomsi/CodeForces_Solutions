import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String players = scanner.next();
        
        int consecutiveCount = 1;
        boolean dangerous = false;
        
        for (int i = 1; i < players.length(); i++) {
            // If current player is the same as the previous one
            if (players.charAt(i) == players.charAt(i - 1)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1; // Reset count
            }
            
            if (consecutiveCount >= 7) {
                dangerous = true;
                break;
            }
        }
        
        System.out.println(dangerous ? "YES" : "NO");
    }
}
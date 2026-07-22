import java.util.Scanner;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // Find the score of the k-th place finisher
        int targetScore = scores[k - 1];
        int advancedCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (scores[i] >= targetScore && scores[i] > 0) {
                advancedCount++;
            }
        }
        
        System.out.println(advancedCount);
        sc.close();
    }
}
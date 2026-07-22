import java.util.Scanner;
 
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the target coordinate
        int x = sc.nextInt();
        
        // Calculate the minimum steps needed
        int steps = x / 5;
        
        // If there is a remainder, add one extra step
        if (x % 5 != 0) {
            steps++;
        }
        
        // Print the result
        System.out.println(steps);
        
        sc.close();
    }
}
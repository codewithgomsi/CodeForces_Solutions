import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        int totalSolved = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Check if at least two friends are sure
            if (petya + vasya + tonya >= 2) {
                totalSolved++;
            }
        }
        
        System.out.println(totalSolved);
    }
}
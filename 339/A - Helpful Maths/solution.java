import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Split by '+'
        String[] parts = s.split("\\+");
        
        // Convert to integers
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        
        // Sort
        Arrays.sort(nums);
        
        // Build result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i < nums.length - 1) sb.append("+");
        }
        
        System.out.println(sb.toString());
    }
}
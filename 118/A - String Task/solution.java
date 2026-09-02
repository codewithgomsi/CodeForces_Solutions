import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','o','y','e','u','i'));
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c)) {
                sb.append('.').append(c);
            }
        }
        
        System.out.println(sb.toString());
    }
}
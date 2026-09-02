import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        int upper = 0, lower = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else lower++;
        }
        
        if (upper > lower) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
 
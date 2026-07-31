import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Fast I/O Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;
 
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
 
        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null) break;
                st = new StringTokenizer(s);
            }
            long n = Long.parseLong(st.nextToken());
 
            // Handle the unique invalid base case
            if (n == 10) {
                out.println("-1");
            } 
            // If remainder is 10, use the smallest matching double-digit palindrome 22
            else if (n % 12 == 10) {
                long a = 22;
                long b = n - 22;
                out.println(a + " " + b);
            } 
            // Standard cases: n % 12 creates a valid single-digit palindrome (or 11)
            else {
                long a = n % 12;
                long b = n - a;
                out.println(a + " " + b);
            }
        }
        out.flush();
    }
}
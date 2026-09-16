import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) names[i] = sc.next();
        
        List<Integer>[] adj = new ArrayList[26];
        for (int i = 0; i < 26; i++) adj[i] = new ArrayList<>();
        int[] indeg = new int[26];
        
        boolean impossible = false;
        for (int i = 0; i < n-1; i++) {
            String a = names[i], b = names[i+1];
            int len = Math.min(a.length(), b.length());
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    int u = a.charAt(j) - 'a';
                    int v = b.charAt(j) - 'a';
                    adj[u].add(v);
                    indeg[v]++;
                    found = true;
                    break;
                }
            }
            if (!found && a.length() > b.length()) {
                impossible = true;
            }
        }
        
        if (impossible) {
            System.out.println("Impossible");
            return;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) if (indeg[i] == 0) q.add(i);
        
        StringBuilder order = new StringBuilder();
        while (!q.isEmpty()) {
            int u = q.poll();
            order.append((char)(u+'a'));
            for (int v : adj[u]) {
                indeg[v]--;
                if (indeg[v] == 0) q.add(v);
            }
        }
        
        if (order.length() < 26) System.out.println("Impossible");
        else System.out.println(order.toString());
    }
}
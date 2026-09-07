import java.util.*;
 
public class Main {
    static List<Integer>[] adj;
    static int[] cats;
    static int n, m;
    static int ans = 0;
 
    static void dfs(int u, int parent, int consecutive) {
        if (cats[u] == 1) consecutive++;
        else consecutive = 0;
        
        if (consecutive > m) return;
        
        boolean isLeaf = true;
        for (int v : adj[u]) {
            if (v != parent) {
                isLeaf = false;
                dfs(v, u, consecutive);
            }
        }
        if (isLeaf) ans++;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cats = new int[n+1];
        for (int i = 1; i <= n; i++) cats[i] = sc.nextInt();
        
        adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        
        for (int i = 0; i < n-1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        
        dfs(1, -1, 0);
        System.out.println(ans);
    }
}
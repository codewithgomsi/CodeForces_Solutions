#include <iostream>
#include <vector>
#include <numeric>
#include <cmath>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
    
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int val;
        cin >> val;
        sum += val;
    }
    
    // If the sum is perfectly divisible by 4, it's possible
    if (abs(sum) % 4 == 0) {
        cout << "YES
";
    } else {
        cout << "NO
";
    }
}
 
int main() {
    // Fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    
    return 0;
}
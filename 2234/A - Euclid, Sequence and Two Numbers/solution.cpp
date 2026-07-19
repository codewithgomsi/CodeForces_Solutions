#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
    vector<long long> b(n);
    for (int i = 0; i < n; ++i) {
        cin >> b[i];
    }
 
    // Sort in descending order
    sort(b.rbegin(), b.rend());
 
    // Check if the sequence satisfies the Euclid property
    bool possible = true;
    for (int i = 2; i < n; ++i) {
        if (b[i] != b[i - 2] % b[i - 1]) {
            possible = false;
            break;
        }
    }
 
    if (possible) {
        cout << b[0] << " " << b[1] << "
";
    } else {
        cout << "-1
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
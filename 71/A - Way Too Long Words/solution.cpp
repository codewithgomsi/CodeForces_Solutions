 #include <iostream>
#include <string>
using namespace std;
 
int main() {
    
    int n;
    cin >> n;
    while (n--) {
        string s;
        cin >> s;
        if (s.length() > 10) {
            cout << s[0] << s.size() - 2 << s.back() << "
";
        } else {
            cout << s << "
";
        }
    }
    return 0;
}
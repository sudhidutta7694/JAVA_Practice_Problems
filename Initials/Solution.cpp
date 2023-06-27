class Solution {
  public:
    void printDiamond(int n) {
        // code here
        for (int i=1; i<=2*n; i++) {
            if (i<=n) {
                for (int j=0; j<(2*i)-1; j++) {
                    if (j==0) cout << string((n-i), ' ') << "*";
                    else cout << "*";
            } else if (i>=n+1) {
                for (int j=0; j<(2*n + 1 -i)*2 - 1; j++) {
                    if (j==0) cout << string((i-n-1), ' ') << "*";
                    else cout << "*";
                }
            }
            cout << endl;
        }
    }
};

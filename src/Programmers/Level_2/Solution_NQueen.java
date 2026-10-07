package Programmers.Level_2;

public class Solution_NQueen {
    private boolean[] col;
    private boolean[] diag1;
    private boolean[] diag2;
    private int n;

    private int backtrack(int r) {
        if (r == n) return 1;

        int count = 0;
        for (int c = 0; c < n; c++) {
            if (col[c] || diag1[r + c] || diag2[r - c + n - 1]) continue;

            col[c] = diag1[r + c] = diag2[r - c + n - 1] = true;
            count += backtrack(r + 1);
            col[c] = diag1[r + c] = diag2[r - c + n - 1] = false;
        }
        return count;
    }

    public int solution(int n) {
        this.n = n;
        col = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        return backtrack(0);
    }
}

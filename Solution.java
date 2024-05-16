class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    boolean special = true;
                    for (int k = 0; k < n; k++) {
                        if (k != i) {
                            special &= (mat[k][j] == 0);
                        }
                    }
                    for (int k = 0; k < m; k++) {
                        if (k != j) {                        
                            special &= (mat[i][k] == 0);
                        }
                    }
                    if (special) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

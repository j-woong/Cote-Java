package Programmers.Level_2;
import java.util.*;

public class Solution_삼각달팽이 {
    public int[] solution(int n) {
        int maxNum = (int)(n*n + n) / 2;
        int[] res = new int[maxNum];
        int[][] Dalpang = new int[n][n];

        int[] dr = {1,0,-1};
        int[] dc = {0,1,-1};


        int num = 1;
        int r = 0;
        int c = 0;
        int dir = 0;
        while(num <= maxNum) {
            Dalpang[r][c] = num++;

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if(nr == n || nc == n || nr == -1 || nc == -1 || Dalpang[nr][nc] != 0) {
                dir = (dir+1) % 3;
            }
            nr = r + dr[dir];
            nc = c + dc[dir];

            r = nr;
            c = nc;
        }

        // System.out.println(Arrays.deepToString(Dalpang));
        int index = 0;
        for(int[] row : Dalpang) {
            for(int N : row){
                if (N != 0) {
                    res[index++] = N;
                }
            }
        }


        return res;
    }
}


package Programmers.Level_1;

import java.util.Map;

public class Solution_공원산책 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        int N = park.length;
        int M = park[0].length();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Map<Character, Integer> direction = Map.of('E', 0, 'S', 1, 'W', 2, 'N', 3);


        int x= 0;
        int y= 0;
        for(int i = 0; i < N; i++) {
            char[] row = park[i].toCharArray();
            for(int j = 0; j < M; j++) {
                if(row[j] == 'S') {
                    x = j;
                    y = i;
                }
            }
        }
        for(String route : routes) {
            char DR = route.split(" ")[0].charAt(0);
            int distance = Integer.parseInt(route.split(" ")[1]);

            int curX = x;
            int curY = y;
            boolean isOK = true;

            for(int k = 0; k < distance; k++) {
                curX += dx[direction.get(DR)];
                curY += dy[direction.get(DR)];

                if(curX < 0 || curY < 0 || curX >= M || curY >= N || park[curY].charAt(curX) == 'X') {
                    isOK = false;
                    break;
                }
            }

            if(isOK) {
                x = curX;
                y = curY;
            }
        }
        return new int[]{y,x};
    }
}

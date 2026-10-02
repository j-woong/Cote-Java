package Programmers.Level_2;

import java.util.ArrayDeque;
import java.util.Queue;
public class Solution_미로탈출 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(String[] maps) {
        int n = maps.length, m = maps[0].length();

        int[] start = null;
        int[] lever = null;
        int[] exit = null;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') start = new int[]{i, j};
                else if (c == 'L') lever = new int[]{i, j};
                else if (c == 'E') exit = new int[]{i, j};
            }
        }
        int toLever = bfs(maps, start, lever, n, m);
        if (toLever == -1) return -1;

        int toExit = bfs(maps, lever, exit, n, m);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(String[] maps, int[] start, int[] target, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int y = cur[0];
            int x = cur[1];
            int dist = cur[2];

            if (y == target[0] && x == target[1]) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dx[i];
                int nx = x + dy[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                    if (!visited[ny][nx] && maps[ny].charAt(nx) != 'X') {
                        visited[ny][nx] = true;
                        queue.offer(new int[]{ny, nx, dist + 1});
                    }
                }
            }
        }

        return -1;
    }
}

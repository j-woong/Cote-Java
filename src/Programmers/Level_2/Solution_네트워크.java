package Programmers.Level_2;

public class Solution_네트워크 {
    boolean[] visited;
    int[][] computers;
    int n;

    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        this.visited = new boolean[n];

        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int now) {
        visited[now] = true;
        for(int next = 0; next < n; next++) {
            if(computers[now][next] == 1 && !visited[next]) {
                dfs(next);
            }
        }
    }
}

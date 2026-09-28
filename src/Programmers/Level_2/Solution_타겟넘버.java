package Programmers.Level_2;

public class Solution_타겟넘버 {
    public int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target);
    }
    private int dfs(int level, int res, int[] numbers, int target) {
        if(level == numbers.length) return res == target ? 1 : 0;

        return dfs(level+1, res + numbers[level], numbers, target) + dfs(level+1, res - numbers[level], numbers, target);
    }
}

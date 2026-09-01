package Programmers.Level_2;

public class Solution_연속된부분수열의합 {
    public int[] solution(int[] sequence, int k) {

        int left = 0;
        int right = 0;
        int sum = 0;

        int MinLength = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        while(right < sequence.length) {
            sum += sequence[right];

            while(sum > k && left <= right) {
                sum -= sequence[left++];
            }

            if(sum == k) {
                if(right - left < MinLength) {
                    MinLength = right - left;
                    startIndex = left;
                    endIndex = right;
                }
            }
            right++;
        }

        return new int[]{startIndex, endIndex};
    }
}

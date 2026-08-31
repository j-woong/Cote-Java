package Programmers.Level_2;

/*
***로직***
핵심 로직
step1: 인덱스 생성 및 목표 배열 순회
- 두개의 카드뭉치에서 번갈아, 순서대로 뽑는 경우를 대비하여 인덱스 2개를 각각 0으로 설정함
step2: 목표 배열 순회 및 조건 탐색
- goal 배열을 순회하며 원하는 단어가 있으면서 인덱스가 전체 길이보다 작다면 인덱스를 증가시킴

step2: 조건 탐색 및 배열 탈출
- 만약 현재 인덱스 위치를 가진 카드뭉치의 단어가 원하는 단어와 다르면 "No" 값을 반환
- 배열을 탈출하면 "Yes"를 반환
*/
class Solution_스킬트리 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String word : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
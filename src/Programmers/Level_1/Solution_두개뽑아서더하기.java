package Programmers.Level_1;

import java.util.TreeSet;
/*
***로직***
1. 입력 변수
- numbers: 정수들이 담긴 배열

2. 핵심 변수
- set: 중복 제거를 위한 set 배열

3. 핵심 로직
step1: 중복 제거
- 중복 제거를 위한 set 배열을 생성
- i: 인덱스 0번부터, j는 i+1번부터 시작하여 numbers.length까지 이중 중첩문을 순회하며 set애 add를 해줌
step2: 결과값 반환
- set.stream().mapToInt(Integer::intValue).toArray()를 통해 set을 int 배열로 변환하여 반환

4. 예외처리
- numbers의 길이가 2 이하일 때 예외처리를 해줘야함
*/

public class Solution_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1; j<numbers.length;j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}


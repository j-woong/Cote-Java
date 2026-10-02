package Programmers.Level_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Stolution_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        Set<String> set = new LinkedHashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String curWord = words[i];

            char lastChar = prevWord.charAt(prevWord.length() - 1);
            char firstChar = curWord.charAt(0);

            if (firstChar != lastChar || set.contains(curWord)) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{person, turn};
            }

            set.add(curWord);
        }

        return new int[]{0,0};
    }
}

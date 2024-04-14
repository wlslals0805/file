package day01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test164 {
	public int solution(String[] babbling) {
        int answer = 0;
        String[] validPatterns = {"aya", "ye", "woo", "ma"};

        String patternString = String.join("|", validPatterns); 

        for (String word : babbling) {
            if (isValidWord(word, validPatterns, patternString)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValidWord(String word, String[] patterns, String patternString) {
        Matcher m = Pattern.compile(patternString).matcher(word);
        int lastEnd = 0; 
        String lastMatch = ""; 

        while (m.find()) {
            if (m.start() != lastEnd) {
                return false; 
            }
            String currentMatch = m.group();
            if (currentMatch.equals(lastMatch)) {
                return false; 
            }
            lastMatch = currentMatch;
            lastEnd = m.end();
        }

        return lastEnd == word.length(); 
    }
}

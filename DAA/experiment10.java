// To implement robin Carp algorithm and analyse it's time complexity.

import java.util.HashSet;
import java.util.Set;

public class experiment10 {
    public static void rabinKarp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int patternHash = pattern.hashCode();
        Set<Integer> indices = new HashSet<>();

        for (int i = 0; i <= n - m; i++) {
            String substring = text.substring(i, i + m);
            if (substring.hashCode() == patternHash && substring.equals(pattern)) {
                indices.add(i);
            }
        }

        System.out.println("Pattern found at indices: " + indices);
    }

    public static void main(String[] args) {
        String text = "ABABCABAB";
        String pattern = "ABAB";
        rabinKarp(text, pattern);
    }
}

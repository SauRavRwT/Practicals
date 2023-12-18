// To implement naïve String Matching algorithm, Rabin Karp algorithm, and Knuth Morris Pratt algorithm and analyze its time complexity.

// NaiveStringMatching
// Time Complexity:
// Best Case: O(n) (when the pattern occurs at the beginning of the text)
// Average Case: O(m * (n - m + 1))
// Worst Case: O(m * (n - m + 1))

public class NaiveStringMatching {
    public static void naiveStringMatch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABCABABABCABA";
        String pattern = "ABABC";

        System.out.println("Naive String Matching Algorithm:");
        naiveStringMatch(text, pattern);
    }
}

// RabinKarp
// Time Complexity:
// Best Case: O(n + m) (when the pattern occurs at the beginning of the text)
// Average Case: O(n + m)
// Worst Case: O(n * m)

import java.util.HashSet;
import java.util.Set;

public class RabinKarpAlgorithm {
    private static final int d = 256; // Number of characters in the input alphabet

    public static void rabinKarpSearch(String text, String pattern, int q) {
        int m = pattern.length();
        int n = text.length();
        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        int p = 0; // Hash value for the pattern
        int t = 0; // Hash value for the current window of text

        for (int i = 0; i < m; i++) {
            p = (p * d + pattern.charAt(i)) % q;
            t = (t * d + text.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                if (pattern.equals(text.substring(i, i + m))) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
                if (t < 0) {
                    t += q; // Make sure the hash value is non-negative
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABCABABABCABA";
        String pattern = "ABABC";
        int q = 101; // A prime number

        System.out.println("Rabin-Karp Algorithm:");
        rabinKarpSearch(text, pattern, q);
    }
}

// KnuthMorrisPratt
// Time Complexity:
// Best Case: O(n + m)(when the pattern occurs at the beginning of the text)
// Average Case: O(n + m)
// Worst Case: O(n + m)

public class KMPAlgorithm {
    public static void kmpSearch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0; // Length of the previous longest prefix suffix

        for (int i = 1; i < m; i++) {
            while (len > 0 && pattern.charAt(i) != pattern.charAt(len)) {
                len = lps[len - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
            }

            lps[i] = len;
        }

        return lps;
    }

    public static void main(String[] args) {
        String text = "ABABCABABABCABA";
        String pattern = "ABABC";

        System.out.println("Knuth-Morris-Pratt Algorithm:");
        kmpSearch(text, pattern);
    }
}

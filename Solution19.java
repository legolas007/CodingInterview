package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 *
 * if p.charAt(j) == s.charAt(i)  :  then dp[i][j] = dp[i-1][j-1];
if p.charAt(j) == '.'          :  then dp[i][j] = dp[i-1][j-1];
if p.charAt(j) == '*'          :
if p.charAt(j-1) != s.charAt(i)  :  then dp[i][j] = dp[i][j-2]  // a* only counts as empty
if p.charAt(j-1) == s.charAt(i)
or p.charAt(i-1) == '.'             :
then dp[i][j] = dp[i-1][j]   // a* counts as multiple a
or dp[i][j] = dp[i][j-1]   // a* counts as single a
or dp[i][j] = dp[i][j-2]   // a* counts as empty
 */
public class Solution19 {
    public boolean match(char[] str, char[] pattern) {
        int m = str.length, n = pattern.length;
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++)
            if (pattern[i - 1] == '*')
                dp[0][i] = dp[0][i - 2];

        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.')
                    dp[i][j] = dp[i - 1][j - 1];
                else if (pattern[j - 1] == '*')
                    if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.')
                        dp[i][j] = dp[i][j - 1] || dp[i][j - 2] || dp[i - 1][j];
                    else
                        dp[i][j] = dp[i][j - 2];
        return dp[m][n];
    }
}

import java.util.*;
class Solution {
    public int mostWordsFound(String[] ss) {
       int max = 0;
        for(String s :ss)
            max = Math.max(max, new StringTokenizer(s).countTokens());

        return max; 
    }
}


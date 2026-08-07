//approach:

/*Start with first string as answer.

Compare answer with each next string.

Remove characters from answer until it matches.

Return answer.*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }

        return prefix;
    }
}
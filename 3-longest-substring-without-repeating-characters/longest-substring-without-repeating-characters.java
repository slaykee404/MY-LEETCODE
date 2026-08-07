class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int left=0;
        int MaxLength=0;
        int right;

        for(right=0;right<s.length();right++)
        {
            char current=s.charAt(right);
            while (set.contains(current))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            int CurrentLength=right-left+1;
            if(CurrentLength>MaxLength)
            {
                MaxLength=CurrentLength;
            }
        }
        return MaxLength;


    }
}
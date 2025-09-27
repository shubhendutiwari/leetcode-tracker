// Last updated: 9/27/2025, 5:20:33 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxSize=0;
        HashSet<Character> seen = new HashSet<>();
        for(int right=0; right<s.length();right++){
        while(seen.contains(s.charAt(right))){
            seen.remove(s.charAt(left));
            left++;
        }
            seen.add(s.charAt(right));
            maxSize = Math.max(maxSize, right-left+1);
        }
        return maxSize;
        
    }
}
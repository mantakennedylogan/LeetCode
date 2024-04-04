class Solution {
    public int maxDepth(String s) {
        int cur = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cur++;
            }
            if(s.charAt(i) == ')'){
                max = Math.max(max,cur);
                cur--;
            }
        }
        return max;
    }
}

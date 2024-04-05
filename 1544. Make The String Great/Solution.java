class Solution {
    public String makeGood(String s) {
        if(s.isEmpty() || s.length() == 1) return s;
        StringBuilder str = new StringBuilder();
        
        str.append(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            if(str.isEmpty()){
                str.append(s.charAt(i));
                continue;
            }
            if(Math.abs(str.charAt(str.length()-1) - s.charAt(i)) == 32){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
        
    }
}

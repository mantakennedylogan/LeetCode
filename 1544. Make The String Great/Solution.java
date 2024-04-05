class Solution {
    public String makeGood(String s) {
        // This code will build a new string and return that
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


        /*
        // This code will remove characters from the input string
        int i = 0;
        for(i = 0; i < s.length()-1; i++){
            
            if(Character.toUpperCase(s.charAt(i+1)) == Character.toUpperCase(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i+1)) == Character.isLowerCase(s.charAt(i)) || 
                   Character.isLowerCase(s.charAt(i+1)) == Character.isUpperCase(s.charAt(i))){
                    
                   
                    s = s.substring(0,i) + s.substring(i+2);
                    System.out.println(s);
                    i= i-1;
                    while(i >= 0 && i < s.length()-1 && Character.toUpperCase(s.charAt(i+1)) == Character.toUpperCase(s.charAt(i)) &&
                          (Character.isUpperCase(s.charAt(i+1)) == Character.isLowerCase(s.charAt(i)) || 
                          Character.isLowerCase(s.charAt(i+1)) == Character.isUpperCase(s.charAt(i))) ){  
                        s = s.substring(0,i) + s.substring(i+2);
                        System.out.println(s);
                        i= i-1;
                    }
                    
                }
            }
        }
        return s;
        */
    }
}

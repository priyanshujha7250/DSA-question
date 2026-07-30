class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        if(s.length() == 1){
            return s;
        }
        int last = s.length();
        for(int i = s.length()-2;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(i+1 != last){
                
                sb.append(s.substring(i+1, last));
                sb.append(" ");
               
                }
                last = i;
            }
            if(i == 0){
                sb.append(s.substring(0, last));
            }
        }
        return sb.toString();
    }
}

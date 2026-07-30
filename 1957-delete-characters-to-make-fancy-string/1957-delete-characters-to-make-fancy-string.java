class Solution {
    public String makeFancyString(String s) {
        if(s.length() == 0){
            return s;
        }
        StringBuilder sc = new StringBuilder("");
        int count = 1;
        sc.append( s.charAt(0));
        for(int i = 1 ; i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                count = 1;
            }
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            if(count < 3){
                sc.append(s.charAt(i));
            }
        }
        return sc.toString();
    }
}
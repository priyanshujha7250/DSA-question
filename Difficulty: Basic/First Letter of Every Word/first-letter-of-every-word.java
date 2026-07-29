class Solution {
    String firstAlphabet(String s) {
        // code here
        s = s.trim();
        String n = "" + s.charAt(0);
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == ' '){
                ++i;
                n += s.charAt(i);
            }
        }
        return n;
    }
};
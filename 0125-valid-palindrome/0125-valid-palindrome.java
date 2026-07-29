class Solution {
    public boolean isPalindrome(String s) {
        s= s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i)<=122 || (int)s.charAt(i) >= 65 && (int)s.charAt(i)<=90 || (int)s.charAt(i) >= 48 && (int)s.charAt(i)<=57 ){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        s = s.toLowerCase();
        int n = s.length()-1;
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }
}
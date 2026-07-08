class Solution {
    String common(String s1,String s2){
        String s = "";
        int n = Math.min(s1.length(),s2.length());
        for(int i = 0;i<n;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                s = s + s1.charAt(i);
            }
            else{
                break;
            }
        }
        return s;
    }
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i = 1;i<strs.length;i++){
            s = common(s,strs[i]);
        }
        return s;
    }
}
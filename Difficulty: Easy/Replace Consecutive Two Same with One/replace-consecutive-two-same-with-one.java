class Solution {
    public String removeDuplicates(String s) {
        // code here
        s = s.trim();

        if(s.length() == 0){
            return "";
        }
  //      String str = "" + s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
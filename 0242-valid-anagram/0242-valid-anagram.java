class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // int arrs[] = new int[s.length()];
        // int arrt[] = new int[t.length()];
        // for(int i = 0;i<arrs.length;i++){
        //     arrs[i] = (int)s.charAt(i) - 97;
        // }
        // for(int i = 0;i<arrt.length;i++){
        //     arrt[i] = (int)t.charAt(i) - 97;
        // }
        // Arrays.sort(arrs);
        // Arrays.sort(arrt);
        // int max = Math.max(arrs.length,arrt.length);
        // for(int i = 0;i<max;i++){
        //     if(arrs[i] != arrt[i]){
        //         return false;
        //     }
        // }
        // return true;
        if(s.length() != t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[(int)s.charAt(i) - 97]++;
            freq[(int)t.charAt(i) - 97]--;
        }
        for(int i = 0;i<26;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;

    }
}
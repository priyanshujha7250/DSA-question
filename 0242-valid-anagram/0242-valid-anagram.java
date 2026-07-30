class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // int freq[] = new int[26];
        // for(int i = 0;i<s.length();i++){
        //     freq[(int)s.charAt(i) - 'a']++;
        //     freq[(int)t.charAt(i) - 'a']--;
        // }
        // for(int i = 0;i<26;i++){
        //     if(freq[i] != 0){
        //         return false;
        //     }
        // }
        // return true;
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            freq[sArr[i] - 'a']++;
        }

        for (int i = 0; i < tArr.length; i++) {
            freq[tArr[i] - 'a']--;
            // Agar frequency negative ho gayi, matlab 't' mein yeh char extra hai
            if (freq[tArr[i] - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
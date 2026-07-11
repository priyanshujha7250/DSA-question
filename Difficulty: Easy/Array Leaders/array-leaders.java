class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int last = arr[arr.length-1];
        al.add(last);
        for(int i =  arr.length-2;i>=0;i--){
            if(last<=arr[i]){
                last = arr[i];
                al.add(arr[i]);
                
            }
        }
        int left = 0;
        int right = al.size()-1;
        while(left<right){
            int temp = al.get(left);
            al.set(left,al.get(right));
            al.set(right,temp);
            left++;
            right--;
        }
        return al;
    }
}

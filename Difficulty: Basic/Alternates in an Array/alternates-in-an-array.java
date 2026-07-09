class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            al.add(num);
            i= i+1;
        }
        return al;
    }
}
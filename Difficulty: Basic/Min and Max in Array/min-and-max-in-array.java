class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            if(max < num){
                max=num;
            }
            if(min>num){
                min=num;
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>(2);
        al.add(min);
        al.add(max);
        return al;
    }
}

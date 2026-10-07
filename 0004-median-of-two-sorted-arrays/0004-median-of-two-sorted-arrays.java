class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length+nums2.length;
        int arr[] = new int[sum];
        // nums1 = a. ,, nums2 = b
        int a = 0;
        int b = 0;
        int k = 0;
        while(a<nums1.length & b < nums2.length){
            if(nums1[a]<nums2[b]){
                arr[k] = nums1[a];
                k++;
                a++;
            }
            else{
                arr[k] = nums2[b];
                k++;
                b++;
            }
        }
        while(a<nums1.length){
            arr[k] = nums1[a];
            a++;
            k++;
        }
        while(b<nums2.length){
            arr[k] = nums2[b];
            b++;
            k++;
        }

        int res = sum / 2;
        if(sum % 2 == 0){
            return ((double)arr[res-1]+arr[res])/2;
        }
        else{
            return arr[res];
        }
    }
}



        // int max = nums1.length+ nums2.length;
        // int arr[] = new int[max];
        // int i = 0;
        // for( ; i<nums1.length;i++){
        //     arr[i] = nums1[i];
        // }
        // for( ;i<nums2.length;i++){
        //     arr[i] = nums2[i];
        // }
        // for(int j = 0; j<arr.length; j++){
        //     for(int k = j+1; k<arr.length;k++){
        //         if(arr[j]>arr[k]){
        //             int temp =arr[j];
        //             arr[j] = arr[k];
        //             arr[k] = temp;
        //         }
        //     }
        // }
        // if(max%2 == 0){
        //     return (arr[(max/2)-1] + arr[max/2])/2;
        // }
        // else{
        //     return arr[(max+1)/2];
        // }
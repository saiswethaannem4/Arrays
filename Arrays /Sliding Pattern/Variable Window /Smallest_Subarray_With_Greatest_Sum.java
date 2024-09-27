class MinSizeSubarraySum{

    /*Given an array of positive integers and a target sum S, find the length of the smallest contiguous subarray
     whose sum is greater than or equal to S. Return 0 if no such subarray exists. */

    public static int MinimumSumArray(int[] array, int n){
        int start=0; int end = 0;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        for(end=0;end<array.length;end++){
            windowSum+= array[end];
            while(windowSum>=n){
                minLength = Math.min(minLength, end-start+1);
                windowSum -= array[start];
                start++;
            }
        }

        return minLength==Integer.MAX_VALUE? 0: minLength;
        

    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        int minArraySize = MinimumSumArray(array, 7);
        System.out.println(minArraySize);

    }
}
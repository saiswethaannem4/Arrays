class MaximumSubArrayofK{
//Time Complexity ; O(N) each element is added and removed from exactly only once
//Space Complexity : O(1) We need exactly same apunt of space.
    public static int GetMaximumSum(int[] array, int k){
        int start = 0; int end = 0;
        int maxSum = 0; int windowSum = 0;

        for(end =0; end<array.length;end++){
            windowSum += array[end];

            if(end>=k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -=array[start];
                start++;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1,2,3,4,5,6,7};
        int maximumSum = GetMaximumSum(arr,3);
        System.out.println(maximumSum);
    }
}
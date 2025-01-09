public class FindMissingNumber {
    public static void main(String[] args){
        long[] arr = {3, 7, 1, 2, 6, 4};
        int n = arr.length;

        long missingNumber = findMissingNumber(arr, n);

        System.out.println(missingNumber);
    }

    public static long findMissingNumber(long[] arr, int n) {
        long sum = ((n + 1) * (n + 2)) / 2;

        long arraySum = 0;
        for (long num : arr){
            arraySum += num;
        }

        // the missing number is sum(1, n+1) minus the sum of the elements in the array 
        return sum - arraySum;
    }
}

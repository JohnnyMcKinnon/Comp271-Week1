public class Realistic{
    /**
     * scan the entire array to find the smallest value 
     * @param arr []int array to explore
     * @return int with the smallest value in array arr
     */
    public static int getSmallest(int[] arr) {
        int result = 0;
        //Assume the first element in the array is the smallest 
        int index_smallest = 0;
        //loop through rest of array to find smallest
        for(int i=1;i<arr.length; i++){
        //check if current position [i] is smaller
        if (arr[i]<arr[index_smallest]) {
            index_smallest=i;
        }
    }
        return arr[index_smallest];
    }   //method getSmallest
} //Realistic Class

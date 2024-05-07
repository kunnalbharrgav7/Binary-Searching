package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {14,22,37,41,59,63,75,88};
        int target = 59;
        System.out.println(Search(arr, target));  
        
    }

    public static int Search(int[] arr , int target){
        int startarray = 0;
        int endarray = arr.length - 1 ;

        while (startarray <= endarray) {
            int mid = startarray + (endarray - startarray) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                startarray = mid + 1;
            }
            else if (arr[mid] > target) {
                endarray = mid - 1;
            }    
        }
        return -1;
    }
}


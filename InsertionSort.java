public class InsertionSort {



    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int minValue = arr[i];
            int j = i-1;
            for(; j >=0 && arr[j] > minValue; j--){
                  arr[j+1] = arr[j];
            }
            arr[j+1] = minValue;
        }

        return arr;
    }


    public static void main(String[] args){

        int[] arr = {2,5,3,7,5,9,10};

        printArray(sortArray(arr));
   
    }
}
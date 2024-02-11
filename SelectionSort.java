public class SelectionSort {



    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                  if(arr[minIndex] >  arr[j]){
                     minIndex = j;
                  }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }


    public static void main(String[] args){

        int[] arr = {2,5,3,7,5,9,10};

        printArray(sortArray(arr));
   
    }
}
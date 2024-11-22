public class Sorting {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int i = 0; i <= n - 2 - turn; i++) { // Fixed increment variable
                if (arr[i] > arr[i + 1]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Added space for better readability
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        System.out.println("Original Array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
     
public class Sorting {

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int turn = 0; turn< n-1; turn++){
            int maxElementIndex = 0;
            for(int j = 0; j<= n-1-turn; j++){
                if(arr[j]>arr[maxElementIndex]){
                    maxElementIndex = j;
                }
            }
            int temp = arr[n-1-turn];
            arr[n-1-turn]= arr[maxElementIndex];
            arr[maxElementIndex] = temp;
        }
    }

         public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Added space for better readability
        }
        System.out.println();
     }
    public static void main(String[]args){
        int arr [] = {3,6,2,1,8,7,4,8,3,1};
        selectionSort(arr);
        printArray(arr);

    }
}


                                                                                                  
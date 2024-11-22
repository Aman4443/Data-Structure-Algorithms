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

//Insertion Sort in Java
public class Sorting {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};

        System.out.println("Original Array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Method to sort the array using Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements of the array that are greater than the key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



// Counting Sorting in java

public class solution {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 3, 2, 7};

        System.out.println("Original Array:");
        printArray(array);

        countingSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Method to perform Counting Sort
    public static void countingSort(int[] array) {
        // Find the maximum value in the array
        int max = findMax(array);

        // Create a count array of size (max + 1)
        int[] count = new int[max + 1];

        // Count the occurrences of each element
        for (int num : array) {
            count[num]++;
        }

        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    // Helper method to find the maximum value in the array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


                                                                                                  

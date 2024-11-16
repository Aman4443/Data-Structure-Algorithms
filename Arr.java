//This is the Swaping of Numbers By Call By Value

public class arr {
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The Value after Swaping");
        System.out.println(a +" " + b);
    }
    public static void main(String[]args){
        int a = 2;
        int b = 5;
        System.out.println(a +" " + b);
        swap(a,b);
        

    }
 }


// This is the Swaping By Call By Reference

public class arr {
    public static void swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.print(arr[0]+ " "+ arr[1]);
    }
    public static void main(String[]args){
        int arr[] = new int[2];
        arr[0] = 2;
        arr[1] = 5;
        System.out.print(arr[0]+ " "+ arr[1]);
      
        swap(arr);
    
    }
    
}



//This is the LinearSearch 

 public class Arr{
    public static int search(int[] arr, int tar){
        int size = arr.length;
        for(int idx = 0; idx<size;idx++){
            if(arr[idx]==tar){
                return idx;
            }
        } return -1;
    } 
    public static void main(String[]args){
        int arr[] = {2,5,1,4,9,7,3,};
        System.out.println(search(arr, 3)); 
    }
  }
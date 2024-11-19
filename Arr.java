// //This is the Swaping of Numbers By Call By Value

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


// // This is the Swaping By Call By Reference

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



// //This is the LinearSearch 

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


//   Max Sub Array By Brute Force Algorithm.

public class Aee {

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum += numbers[k];
                } 
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum is  "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubarraySum(numbers);
    }
}

//  Max Sub Array By Prefix Sum

    public class Aee {
        public static void maxSubarraySum(int numbers[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefix[]= new int[numbers.length];

            prefix[0] = numbers[0];
            //  calculate Pefix Array 
            for( int i = 1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }
            for(int i= 0 ; i<numbers.length;i++){
                int start = i;
                for(int j = i;j<numbers.length; j++){
                    int end = j;

                    currSum = start == 0  ? prefix[end] : prefix[end] - prefix[start -1];
                    if(maxSum < currSum){

                    maxSum = currSum;                    }
                }
            }
            System.out.println("max Sum  =" + maxSum);
        }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
    }

  
    

    // Max Sub Array By Kadane's Algorithm

    public class Aee {
        public static void kadanes(int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for(int i = 0; i<numbers.length;i++){
                cs = cs+numbers[i];

                if(cs<0){
                    cs = 0;
                }
                ms = Math.max(cs,ms);
            }
            System.out.println("max SubArray is :" +ms);
        }
        public static void main(String[]args){
            int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
            kadanes(numbers);
        }
    }


  



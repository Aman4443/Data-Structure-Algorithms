// sum of all elements in second row
import java .util.*;
public class sumOfRow {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[rows][column];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                arr[i][j]= sc .nextInt();
            }
        }
        int sum = 0;
        // take the sum of all element in second row
        for(int j = 0; j<column;j++){
            sum =sum + arr[1][j];
        }
        System.out.println("sum of second row is " + sum);
    }
    
    
}



// Transpose of a matrix 
 import java .util.*;
public class sumOfRow {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int column = sc.nextInt();

    int arr[][] = new int[rows][column];
    for(int i = 0; i<rows; i++){

    for(int j = 0; j<column; j++){
        arr[i][j] = sc.nextInt();
    }
    }
    int transpose[][] = new int[rows][column];
    for(int i = 0; i<rows; i++){
        for(int j = 0; j<column; j++){
            transpose[j][i] = arr[i][j];
        }
    }
    System.out.println("Transpose matrix");
    for(int i = 0; i<rows; i++){
        for(int j = 0; j< column; j++){
            System.out.print(transpose[i][j]+ "");
        }
        System.out.println();
    }
   }
    
}


// Print sum of alements in second row in twoD array

import java .util.*;
public class sumOfRow {
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int rows = sc.nextInt();
    int column = sc.nextInt();

    int arr[][] = new int[rows][column];
    for(int i = 0; i<rows; i++){
    for(int j = 0; j<column; j++){
        arr[i][j] =sc.nextInt();
    }
    }
    int i = 0;
    int j = column-1;
    int target = sc.nextInt();
    while(i<rows && j>=0){
        if(arr[i][j]== target){
            System.out.println("element found at: "+ i+" " +j);
            break;
        }
        else if(arr[i][j]<target){
            i++;
        }
        else if(arr[i][j]>target){
            j--;
        }
    }
}
}


    

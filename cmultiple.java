import java.util.*;

public class cmultiple{
    public static void main(String[] args) 
    {
        // code to take the input by default.
        // int arr[] ={2,5,23,56,33,0,4};


        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();     //code to take the size of the array from the user.
        int arr[] = new int[n]; 
        //for taking the input from the user.
        //the code below only takes the integers as input as the array elements.
        try {
            for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }           
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Please give the input as integers only.");
        }
        

        //code for printing the array normal array.
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // sc.close();

        //code to calculate cumulative multiple at each index.
        for(int j = 1;j<arr.length;j++){
            arr[j] = arr[j-1]*arr[j];
        }    


        //code to print the updated array
        for(int k = 0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
// Java Program to split a given array 
// such that the difference between 
// their maximums is minimized. 
import java.util.*; 

class GeekArray
{ 

    static int findMinDif(int arr[], int N) 
    { 

        // Sort the array 
        Arrays.sort(arr); 
        // Return the difference between 
        // two highest elements 
        return (arr[N - 1] - arr[N - 2]); 
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {20,30,10,40,60,50,12}; 
        int N = arr.length; 

        System.out.println(findMinDif(arr, N)); 
    } 
} 

// This code is contributed by offbeat 

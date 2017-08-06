package BruteForce;
import java.io.*;
import java.util.*;
import java.math.*;


class Permutations{
	private static void permuteHelper(int[] arr, int index){
	    if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
	        //System.out.println(Arrays.toString(arr));
	        //Print the array
	        System.out.print("[");
	        for(int i = 0; i < arr.length - 1; i++){
	        	// OPERATION GOES HERE
	            //System.out.print(arr[i] + ", ");
	        }
	        /*
	         * Only include the below if you actually want to print the array:
	         * 
	        if(arr.length > 0) 
	            System.out.print(arr[arr.length - 1]);
	        System.out.println("]");
	        */
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;

	        //Recurse on the sub array arr[index+1...end]
	        permuteHelper(arr, index+1);

	        //Swap the elements back
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
	public static void main(String[] args) {
		permuteHelper(new int[] {1, 2, 3, 4, 5}, 0);
	}
}
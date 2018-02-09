// My solution to the HackerRank.com problem "Cut The Sticks."
// https://www.hackerrank.com/challenges/cut-the-sticks/problem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticksApp {

    static int[] cutTheSticks(int[] arr) {

    	int nbrOfSticks = arr.length;
 
       	ArrayList<Integer> tempArraySticks = new ArrayList<>(); 
       	
    	for(int idx1 = 0; idx1 < arr.length; idx1++) {
    	   	int minHt = 1000;  	
    		System.out.println("Array arr = "+ Arrays.toString(arr));
    		if(nbrOfSticks == 0) {
    			break;
    		}
    		tempArraySticks.add(nbrOfSticks);
        	System.out.println("Temp Array Sticks = "+ tempArraySticks.toString());
        	
    		for(int idx2 = 0; idx2 < arr.length; idx2++) {  
    			if(arr[idx2] > 0) {
    			minHt = Math.min(minHt, arr[idx2]);
    			}
    		}
			System.out.println("Min ht = "+minHt);
    		for(int idx3 = 0; idx3 < arr.length; idx3++) {
    			if(arr[idx3] >0) {
    			arr[idx3] -= minHt;
    				if(arr[idx3] == 0) {
    					nbrOfSticks--;
    					System.out.println("Nbr of sticks="+ nbrOfSticks);
    				}
    			}
    		}   
    	}

		int [] result = new int [tempArraySticks.size()];
    	for( int idx4 = 0; idx4 < tempArraySticks.size(); idx4++) {
    		result[idx4] = tempArraySticks.get(idx4);
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of sticks, n (integer 1-1000): "); 
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            System.out.print("Enter the height of stick #"+(arr_i +1)+": "); 
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}

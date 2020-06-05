package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author suraj
 *
 */

public class TwoDimensionArray {

	public static void main(String[] args) {
		int arr[][]; //2 D array decleration
		int[][] arr1;
		
		arr=new int[2][2]; //2 D array initialization
		arr1=new int[3][3];
		/**
		 * int[][] arr2=new int[4][]; This will work
		 * int[][] arr2=new int[][5]; This will throw error
		 */
		
		int[][] array= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; //Decleration and intialization
		
		/**
		 * @Creating_multidimensional_array
		 * int[][] multi=new int[3][];
		 * multi[0]=new int[5]; //Will store 5 data
		 * multi[1]=new int[3]; //Will store 3 data
		 * multi[2]=new int[2]; //Will store 2 data
		 */
		
		
	}

}

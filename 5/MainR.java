package task2;

import java.io.IOException;

public class MainR{
	
 public static void main(String[] args) throws IOException{
	 
		        int[]array = new int[1000];
		        int count = array.length;
		        System.out.println(RadixSort.read(array,"numberlist.txt"));
		        RadixSort.sort(array,count,4);
		        System.out.println(array[999]);
		    }	
		
		
	}
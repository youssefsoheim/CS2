package task1;


import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortStrings
	{

	


    public static void main(String args[]) throws IOException
    {
    	CompSort s = new CompSort();
    	
        File reader = new File("wordlist.txt");
        Scanner sc = new Scanner(reader);
        ArrayList<String> lines = new ArrayList<String>();
        

        while (( sc.hasNext())==true )
        {
            lines.add(sc.nextLine());
        }
        
        String[] arr = lines.toArray(new String[lines.size()]);
        Arrays.sort(arr,s);
    }


}

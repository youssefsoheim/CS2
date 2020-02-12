package task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RadixSort
{

    public static int read(int[] Anum ,String file) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File(file));
        int counter = 0;
        while (input.hasNextInt())
        {
            Anum[counter] = input.nextInt();
            counter++;
        }
        return counter;
    }

    public static void sort(int[]num,int count, int width)
    {
        for (int i = 0; i <width ; i++)
        {
            radixSingle(num, i, count);
        }
    }

    public static void radixSingle(int[]num, int position, int count)
    {
        int numItems = num.length;
        int[]countArr = new int[count];

        for (int value : num)
        {
            countArr[getD(position,value,count)]++;
        }
        for (int j = 1; j < count ; j++)
        {
            countArr[j] += countArr[j - 1];
        }

        int[]temp = new int[numItems];

        for (int index = numItems - 1; index >= 0 ; index--)
        {
            temp[--countArr[getD(position,num[index], count)]] = num[index];
        }

        for (int index = 0; index < numItems; index++)
        {
            num[index] = temp[index];
        }
    }

    public static int getD(int positon, int value, int radix)
    {
        return value/(int) Math.pow(10,positon) % radix;
    }

    public static void store(int[]numArrray, int count, String fileName) throws IOException
    {
        PrintWriter writer = new PrintWriter(fileName);
        for (int i = 0; i < count; i++) {
            writer.write(numArrray[i]+"\n");
        }
        writer.close();
    }
}
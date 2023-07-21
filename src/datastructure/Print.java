package datastructure;

import java.util.Scanner;

public class Print {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
         int n=input.nextInt();
         int []merge=new int[n];
         for (int i=0;i<n;i++)merge[i]=input.nextInt();
       Algorithm.mergeSort(merge,0,n-1);
       Algorithm.printArray(merge);


    }
}

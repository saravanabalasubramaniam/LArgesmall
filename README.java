import java.io.*;
import java.util.*;
class Largestsmallest1
{
 public static void main(String args[])
 {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println("");
	}
        int min=arr[0];
	for(int j=1;j<a;j++)
	{
		if(min>arr[j])
		{
			min=arr[j];
		}
	}
	System.out.print(min +"\t");
	int max=arr[0];
	for(int k=1;k<a;k++)
	{
		if(max<arr[k])
		{
			max=arr[k];
		}
	}
	System.out.print(max);
	
	
 }
}

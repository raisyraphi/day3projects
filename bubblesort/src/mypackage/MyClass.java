package mypackage;

import java.util.Scanner;

public class MyClass {

	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                         }  
                          
                 }  
         }  
	} 
       
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] arr=new int [5];
		;		
				Scanner obj=new Scanner(System.in);
				for(int i=0;i<arr.length;i++)
				{
					System.out.println("enter the number");
					arr[i]=obj.nextInt();
				}
					  bubbleSort(arr);
				
					for (int k=0; k<arr.length; ++k)
					{   
					 System.out.print(arr[k] + " ");
			         System.out.println();
					
					}
				
		
		
		
		
		
	}

}

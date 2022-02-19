package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data=new int [5];
		;		
				Scanner obj=new Scanner(System.in);
				for(int i=0;i<5;i++)
				{
					System.out.println("enter the number");
					data[i]=obj.nextInt();
				
				}
				int temp=data[0];
				for(int i=1;i<data.length;i++)
				{
					if(data[i]>temp)
						temp=data[i];
					
				}
				
		System.out.println("largest number is:"+temp);
		
		
	}

}

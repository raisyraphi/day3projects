package mypackage;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] data= new int[5];
		Scanner obj= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		System.out.println("enter number");
		data[i]=obj.nextInt();
		}
		
		for(int i=0;i<5;i++)
			System.out.println(data[i]);
		
		//for each
		
		
		for(int d:data)
			System.out.println(d);

	}


	
	
	
	
}

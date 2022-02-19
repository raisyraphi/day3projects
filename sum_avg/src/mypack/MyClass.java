package mypack;
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
		
		int sum=0,avg;
		for(int d:data)
			sum+=d;
		avg=sum/5;
		
		System.out.println( "sum "+sum);
		System.out.println( "average "+avg);

	}

}

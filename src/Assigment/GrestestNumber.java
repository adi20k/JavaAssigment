package Assigment;
import java.util.*;
public class GrestestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++) {
			System.out.print("Enter number");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int num:arr) {
			if(num>max)
				max=num;
		}
		System.out.print("Greatest number is "+max);

	}

}

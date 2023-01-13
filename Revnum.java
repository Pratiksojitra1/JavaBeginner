package testing;

import java.util.Scanner;

public class Revnum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt();
		int rn=0, temp;
//		temp= n%10;
//		rn=temp*0+temp;
//		System.out.print(rn);
//		n=n/10;
//		temp=n%10;
//		rn=temp*0+temp;
//		System.out.print(rn);
//		n=n/10;
//		temp=n%10;
//		rn=temp*0+temp;
//		System.out.print(rn);
		
		while(n!=0) {
			temp =n%10;
			rn=rn*10+temp;
			n=n/10;
		}
		System.out.println("reverse number" + rn );
		
	}

}

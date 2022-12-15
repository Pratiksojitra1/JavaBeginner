package testing;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int s= sc.nextInt();
		for(int i=1;i<=s-1;i++) {
			for(int j=s;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=s;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.println(" ");
		}
		

	}

}

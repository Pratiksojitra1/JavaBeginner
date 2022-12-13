package testing;

import java.util.*;

class Oops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		 int s=0;
		while(s!=6) {
		System.out.println("select below option \n 1 multiply by 2 \n 2 divide by 2\n 3 square it \n 4 reminder if divided by 10");
		System.out.println(" 5 re enter number \n 6 exit");
		 s= sc.nextInt();
		switch(s) {
		case 1 : System.out.println("ans"  + num*2);
		break;
		case 2 : System.out.println("ans"  + num/2);
		break;
		case 3 : System.out.println("ans"  + num*num);
		break;
		case 4 : System.out.println("ans"  + num%2);
		break;
		case 5 : System.out.println("re enter number");
		break;
		case 6 : System.exit(0);
		default: System.out.println("invalid input");
		}
		
}
}
}

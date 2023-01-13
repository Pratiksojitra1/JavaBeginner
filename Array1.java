package testing;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of row");
		int r= sc.nextInt();
		System.out.println("enter no of column");
		int c= sc.nextInt();
		int array[][] = new int[r][c];
			
		for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++){
					array[i][j]=sc.nextInt();	
				}
			}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
			
		}

	}

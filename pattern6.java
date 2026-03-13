/*
n=4

1 2 3 4
1 2 3
1 2
1

*/

import java.util.*;
public class pattern6
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i;j++){
		        System.out.print((j+1)+" ");
		    }
		    System.out.println();
		}
		
	}
}
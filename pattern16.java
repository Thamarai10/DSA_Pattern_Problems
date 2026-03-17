/*
n = 4
A 
BB 
CCC 
DDDD 

*/

import java.util.*;
public class pattern16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   	System.out.print("Enter n value: ");
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print((char)('A'+i));
	        }
	        System.out.println();
	    }
	}
}
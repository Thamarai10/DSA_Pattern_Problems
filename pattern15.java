/*
n = 4

ABCD
ABC 
AB 
A 

*/

import java.util.*;
public class pattern15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter n value: ");
	    int n = sc.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print((char)('A'+j-1));
	        }
	        System.out.println();
	    }
		
	}
}
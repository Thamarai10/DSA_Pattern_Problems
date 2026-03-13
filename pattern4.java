/*
n=4

1
2 2
3 3 3
4 4 4 4

*/

import java.util.*;
class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number value: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
         for(int j=1;j<=i+1;j++){
            System.out.print(i+" ");
         }
        System.out.println();
       }
    }
}
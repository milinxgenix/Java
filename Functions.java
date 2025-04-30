                                                    //FUNCTIONS IN JAVA
                                                    //RECURSION IN JAVA 

                    //factorial by recursion
/*
import java.util.Scanner;
public class Functions{

    public static int sum(int x,int y){
        return x+y;
    }

    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int c=sum(4,6);
        System.out.println(c);
        int d=sc.nextInt();
        System.out.println(factorial(d));

    }  
}
*/

                                     //factorial by traverse
/*
import java.lang.*;
import java.util.Scanner;

public class Functions{

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args)
    {
        System.out.print("enter the number: ");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int rem,n;
        n = num;
        int sum=0;

        while(n > 0)
        {
            rem = n%10;
            sum = sum + factorial(rem);
            n = n/10;  
        }
        
        if(sum == num)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}
*/



                                //passing array as a argument of a function
/*                             
import java.io.*;

class Functions{ 
	public static void function1(int[] array) { 
		System.out.println("The first element is: " + array[0]); 
	} 

	public static void function2(int[][] array) { 
		System.out.println("The first element is: " + array[0][0]); 
	} 

public static void main(String[] args) { 

		// creating a 1D and a 2D array 
		int[] oneDimensionalArray = { 1, 2, 3, 4, 5 }; 
		int[][] twoDimensionalArray = { { 10, 20, 30 }, 
										{ 40, 50, 60 }, 
										{ 70, 80, 90 } }; 
		
		// passing the 1D array to function 1 
		function1(oneDimensionalArray); 
		
		// passing the 2D array to function 2 
		function2(twoDimensionalArray); 
	} 
}
*/

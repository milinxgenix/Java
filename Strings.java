                                        //Non-primitive Datatypes
                            
                                //Strings
/*
class Strings{
    public static void main(String []args)
    {
        String a= "MILIND";
        System.out.println(a);

        String b = new String("kumar");
        System.out.println(b);

        String c = a+" "+b;         //here space is used as string
        System.out.println(c);



                                    //METHODS in string

        System.out.println(c.length());            //length of string
        System.out.println(c.charAt(4));          //position
                    
                            //replace method replaces the character in new string but don't changes the original string
        String d = a.replace('D','x'); 
        System.out.println(a);
        System.out.println(d);
        System.out.println(a.replace('D','x'));

                               //substring
        System.out.println(c.substring(0,4));


                        // STRING MANIPULATION
        String name = "   Saharsh Ojha     ";

        String t=name.trim();        //remove white spaces from ending & begining    we can also use  strip() instead of trim()
        System.out.println(t);      // stripleading() :- begining space remove    striptrailing() :- end space remove

        String l= name.toLowerCase();
        System.out.println(l);

        String u=name.toUpperCase();
        System.out.println(u);

        
        //TO REPLACE A CHARACTER OR CHARACTERS

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rsh","pqr"));
        


        // TO CHECK THE STARTING AND ENDING CHARACTER

        boolean m= name.startsWith("S");  
        boolean n= name.endsWith(" ");  
        
        System.out.println(m);
        System.out.println(n);


        char q = name.charAt(8);
        System.out.println(q);

        int r = name.indexOf("a");
        System.out.println(r);
        
    }
}
*/



                                //convert string into character array and store it
/*                      
import java.util.Scanner;

public class Strings{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        //System.out.println(a);

        // Convert the string to an array of characters
        char[] b = a.toCharArray();

        // int count = 0;
        // for(int i=0; i<10; i++)
        // {                                         //same thing is done using for-in loop below
        //     System.out.println(b[i]);
        //     count++;
        // }
        // System.out.println(count);
        
       int count = 0;
        // Print the array elements
        for (char c : b) 
        {
            System.out.println(c);
            count++;
        }
        System.out.println(count);


}
}
*/


                                //convert string into character array without storing
/* 
import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        String str = "abcd";
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) 
        {
            arr[i] = str.charAt(i);
        }   
    }
}
*/



                                //taking string as an input and converting it into integer array as no of elements in array not available
/*
import java.util.Scanner;

class Strings{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter space-separated numbers: ");
        String input = s.nextLine();
        int target = s.nextInt();

        String str[] = input.split(" ");             // converting string into string array having each elements as characters not string

        int[] numbers = new int[str.length];         
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);      // converted/parsed each element of string array to integer and stored in new array 
        }

        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }        
        }
    }   
}
*/



                                       // Q :- Counting the occurance of letters in a word
/*
import java.util.Scanner;
public class Strings{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char arr[] = str.toCharArray();
    
        for(int i=0; i<str.length(); i++){
            int count = 0;
            int flag = 0;
            for(int j=0; j<str.length(); j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            for(int k=i-1; k>=0; k--){
                if(arr[i]==arr[k]){
                    flag++;
                }
            }

            if(flag==0){
                System.out.println(arr[i] + " is occuring "+ count + " times.");
            }
        }
    }
}
*/
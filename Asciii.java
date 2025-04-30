                                    //Working with ASCII values :- System.in.read()
/*                             
import java.io.*;
public class Asciii{
    public static void main(String[] args) throws IOException{
        System.out.println('A');
        System.out.println("a");
        System.out.println('1');
        System.out.println("a");

    //Finding Ascii value :- 
    //1st method:-
        System.out.print("Enter any character or integer: ");
        int n = System.in.read();                                  // will read and returns ASCII value of any character/integer
        System.out.println("Ascii value of n is: " + n);        
        System.out.println(n-48);                                  // (ASCII value of a No.) - 48 = No.

    //2nd method :-  can't take user input as scanner doesn't work with characters
        char c = 'b';
        char c2 = '4';
        System.out.println((int)c);
        System.out.println((int)c2);

    System.out.println();

    //Finding char/number from Ascii value
        int n2 = 86;
        int n3 = 6;
        System.out.print("character at this Ascii value is: ");
        System.out.println((char)n2);                             //will give character value at n2


        // ASCII value - 48 = Integer at that ASCII value
        // (char)ASCII value = character at that ASCII value
        // int n = System.in.read.(); == ASCII value of any char/integer
    }
}
*/


                                                    //Q on ASCII value mixed with file handling
/*
import java.util.*;
import java.io.*;
public class Asciii{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        
        char[] strArr = str.toCharArray();
        
        //Encyption :- converting each char to ASCII value then adding 1 to it and converting back to Character and storing into same character array
        for(int i=0; i<str.length(); i++){
            strArr[i] = (char)((int)strArr[i] + 1);
        }
        
        String str2 = String.valueOf(strArr);   //converting back char array to string


        File f = new File("encrypted_data.txt");
        f.createNewFile();
        
        FileWriter fw = new FileWriter("encrypted_data.txt");
        fw.write(str2);
        fw.close();
        
        Scanner sc = new Scanner(f);
        String str3 = sc.next();
        sc.close();
        
        //Decryption 
        char[] strArr2 = str3.toCharArray();
        
        for(int i=0; i<str3.length(); i++){
            strArr2[i] = (char)((int)strArr2[i] - 1);
        }
        String str4 = String.valueOf(strArr2);
        
        System.out.println("Encrypted Message: "+str2);
        System.out.println("Decrypted Message: "+str4);
    }
}
*/

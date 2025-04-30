                                //String Builder & String Buffer

//Normal String Operations :- immutable
/*                                    
public class Buffer{
    public static void main(String[] args){
        String name = "Milind";
        name = "kumar " + name;
        System.out.println("hello! "+name); 

        String s1 = "milind";
        String s2 = "milind";

        System.out.println(s1==s2);
    }
}
*/


//String Buffer :- Mutable
/*
public class Buffer{
    public static void main(String[] args){
        StringBuffer sbb = new StringBuffer();
        StringBuffer sb = new StringBuffer("Milind");

        System.out.println(sbb.capacity());         //give default capacity of 16 buffers
        System.out.println(sb.capacity());

        System.out.println(sbb.length());
        System.out.println(sb.length());

        //sb.prepend("Kumar ");                    //Doesn't work
        sb.append(" Singh");
        sb.insert(0, "Kumar ");                 //insert at desired index
        sb.deleteCharAt(2);
        //sb.setLength(10);                     //will decrease the string buffer to length of 10 
        //sb.ensureCapacity(50);                //will set minimum capacity of 50
        System.out.println(sb);

        String str = sb.toString();             //Converting String buffer "str" to String
        System.out.println(str);

        
    }
}
*/



//String Builder :- Mutable
/*
import java.util.*;
public class Buffer{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Milind");
        System.out.println(sb);

        //char at index i
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(5, 'x');           //for character literal use ('') for string use ("")
        System.out.println(sb);

        //insert
        sb.insert(6,"genix");           //with add at 6th index means after 5th index(last word)
        System.out.println(sb);

        //delete
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.delete(6,100);
        System.out.println(sb);

        //append
        sb.append(' ');
        sb.append('K');
        System.out.println(sb);

        //Reverse
        sb.reverse();
        System.out.println(sb);
    }
}
*/


                                        //Reversing String without String Builder
/*                                 
public class Buffer{
    public static void main(String[] args){
        String str = "hello";
        char arr[] = new char[str.length()];
        //arr = str.split();    //won't work for lettters/ char array this we can use to split into words to form string array
        arr = str.toCharArray();
        for(int i=(str.length()-1); i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
*/



                                    //Reversing String using String builder(without using function)
/*
import java.util.*;                            
public class Buffer{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Milind");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; //6-1-0=5 => M will go at index 5 means at last

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
*/

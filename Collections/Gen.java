                                                //JAVA Generics

                                                
//        Without Java Generics :  will throw warning
/*
import java.util.ArrayList;
public class Gen {
    public static void main(String[] args) {

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);                            //Integer value
        myArrayList.add("Harry Bhai!");                 //String value
        myArrayList.add(20.4);                          //Double value
        System.out.println(myArrayList);

                    //int x = myArrayList.get(0);       //will through error need to be typecasted 
        int x = (int) myArrayList.get(0);       //b=object typecasted into integer
        System.out.println(x);

    }
}
*/


//        With Java Generics :    will throw error as it's already declared as <integer> and we r giving string input
/*
import java.util.ArrayList;
public class Gen {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);                    //Integer value
        myArrayList.add("Harry Bhai!");         //String value
        myArrayList.add(20.4);                  //Double value
        System.out.println(myArrayList);

    }
}
*/


//        With Java Generics :    No need to typecast as we declare <datatype> at beginning only 
/*
import java.util.ArrayList;
public class Gen {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        
        myArrayList.add(40);


    }
}
*/



                                                //Creating Generic class
/* 
import java.util.ArrayList;
import java.util.Scanner;


class MyGeneric<T1, T2>{                                //created MyGeneric class and passed T1 & T2 class as argument to it

    //Assining data types to MyGeneric class
    int val;
    private T1 t1;             //t1 variable of T1 datatype
    private T2 t2;                                      

    public MyGeneric(int val, T1 t1, T2 t2) {           //created constructor of that class
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

                        //As T1 & T2 r private so Creating function to get & set data types of Mygeneric class
    public int getVal() {       
        return val;
    }

    public void setVal(int val) {       //this function will return a value of integer
        this.val = val;
    }

    public T1 getT1() {            //this function will return a value of T1 datatype
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {            //this function will return a value of T2 datatype
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}
public class Gen {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));            //without creating scanner class obj we can use like this...

        int a = (int) arrayList.get(0);
        System.out.println(a);


        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);

        // could be done if T1 & T2 were public
            //System.out.println(g1.t1);
            //System.out.println(g1.t2);

        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
*/



                                        //Q on Generic class
/*
import java.util.*;
class Area<T extends Number>{
    private T length;
    private T width;

    public Area(T length, T width){
        this.length = length;
        this.width = width;
    }
    
    public double CalPer(){
        return (length.doubleValue() + width.doubleValue());
    }
        
}
public class Gen{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int width = s.nextInt();
        
        Area<Integer> A = new Area<>(length, width);    //as Area<Integer> means T = Integer 
        System.out.println((int)A.CalPer());    
    }
}
*/

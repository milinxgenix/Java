
                                            //HashSet(uses hashing techniques to easy searching)
/*
import java.util.*;
public class Hsh extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet0 = new HashSet<>();                //if it's empty default initial capacity would be 16 and load factor would be 0.75
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);         //HashSet(int capacity, float loadFactor)  here loadfactor is float so added 'f' 
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);                                          // This element will be ignored as set takes unique elements only 

        
        System.out.println("The size of myHashSet is : " + myHashSet.size());
        System.out.println("myHashSet before removing any element : " + myHashSet);
        System.out.println(myHashSet.isEmpty());
        myHashSet.remove(3);                //deletes 3 from the hashset (not index 3 but element 3 will be deleted)
        System.out.println("myHashSet after removing a element : " + myHashSet);
        myHashSet.clear();                  //deletes all the elements from the hashset
        System.out.println("myHashSet after clearing : " + myHashSet);


        HashSet<Integer> myHashSet1 = new HashSet<>();
        System.out.println(myHashSet1.isEmpty());
    }
}
*/



                                        //HashSet Vs HashMap

// Java program to demonstrate working of HashSet
/*
import java.util.HashSet;               // Importing HashSet class from java.util package

public class Hsh{
	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();
		// Adding elements to the HashSet
		hs.add("geeks");
		hs.add("practice");
		hs.add("contribute");
		

		System.out.println(
			"Before adding duplicate values \n\n" + hs);

		// Addition of duplicate elements
		hs.add("geeks");
		hs.add("practice");

		System.out.println(
			"\nAfter adding duplicate values \n\n" + hs);

		// Addition of null values
		hs.add(null);
		hs.add(null);

		// Displaying HashSet elements
		System.out.println("\nAfter adding null values \n\n"
						+ hs);
	}
}
*/


// Java program to demonstrate working of HashMap
/*  
import java.util.HashMap;                   // Importing HashMap class from java.util package
public class Hsh{
	public static void main(String[] args)
	{
		            // This is how to declare HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding elements to HashMap
		hm.put(12, "geeks");
		hm.put(2, "practice");
		hm.put(7, "contribute");

		System.out.println("\nHashMap object output :\n\n" + hm);

		// store data with duplicate key
		hm.put(7, "geeks");                              
		hm.put(12, "contribute");

		System.out.println("\nAfter inserting duplicate key :\n\n" + hm);

        		// store data with duplicate key
		hm.put(8, "geeks");
		hm.put(12, "contribute");

		System.out.println("\nAfter inserting duplicate key :\n\n" + hm);
	}
}
*/



                                    //Q on hashmap :- METHOD => hashmap_name.get(key) = value
/*
import java.util.*;
class Hsh{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> vars=new LinkedHashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String p=sc.nextLine();
            int q=sc.nextInt();
            sc.nextLine();
            vars.put(p,q);
        }
        System.out.println(vars);
        String x=sc.nextLine();
        int y=sc.nextInt();
        vars.put(x,y);
        System.out.println(vars);
    }
}
*/


                                        //Q on hashmap :- taking inputs & convert to hashmap
/*
import java.util.*;
class Hsh{
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc=new Scanner(System.in);
        HashMap<String,Double> vars=new HashMap<>();
        int temp=1;
         double total=0.0;
        while(true){
            String a=sc.nextLine();
            if(a.toLowerCase().contains("done")){
                break;
            }
            if(!a.contains(":")){
                System.out.println("Invalid format");
                temp=0;
                break;
            }
            String [] arr=a.split(":");
            String x=arr[0];
            String y=arr[1];
            try{
            double m=Double.parseDouble(y);
            vars.put(x,m);
            }
            catch(NumberFormatException r){
                System.out.println("Invalid input");
                temp=0;
                break;
            }
        }
        if(temp==1){
            String s="";
            double max=Double.MIN_VALUE;
        for(Map.Entry<String,Double> f : vars.entrySet()){
            if(f.getValue()>max){
                max=f.getValue();
                s=f.getKey();
            }
        }
          System.out.println(s);
        }
    }
}
*/

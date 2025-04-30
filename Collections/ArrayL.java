                                            //Collection Frameworks 
//Both ArrayList and linkedList uses almost similar methods 
//approaching certain element in arraylist is easier as compared to linkedlist with help of index
// addition and subtraction of element is easier in linkedlist with help of nodes but in array list all elements need to be shifted
// The ArrayList's capacity is increased when it reaches its limit, which can lead to some wasted memory. 
// ArrayDeque: ArrayDeque, on the other hand, is implemented as a double-ended queue. 
// ArrayDeque uses a block-based storage system, which typically results in more efficient memory usage compared to ArrayList.
// ArrayDeque implements Deque interface by which we can add or remove elements from both the ends which makes arraydeque more faster than arraylist.
// Collection class methods :- Collections.sort(ArrayList_Name), Collections.reverseOrder(ArrayList_Name), Collections.reverse(ArrayList_Name)
// class Gen<T extends Comparable <T>>   use this extention to use Collections.sort()
// Collections.frequency(ArrayList_Name , element) :- to find number of times the element occured in arraylist
//  Priority Queue gets inserted in Sorted way



                                                    //LINKEDLIST
/*
import java.util.*;
public class ArrayL{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();     //we can't give initial capacity to linked list
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);                                    //only works in linkedlist
        l1.addFirst(788);                                   //only works in linkedlist
        System.out.println(l1.contains(27));                //RETURNS BOOLEAN VALUE
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        //l1.clear();
        
        l1.set(1, 566);                     //unlike add method it doesn't add but replace the old element with new one
        
        for(int i=0; i<l1.size(); i++){             //intead of length we use size in arraylist
            System.out.print(l1.get(i));            //can't use l1[i] as we do in arrays we have to use get method
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("linked list is: " + l1);       //it can be printed without loop also
    }
}
*/


                                                    //ARRAYLIST
/*
import java.util.*;
public class ArrayL extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(4);        //we can give initial capacity to arraylist
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);     // inserts 5 at the 5th index in l1

        
        System.out.println("Array list before : "+ l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);

        System.out.println("L1 list contains 7 : " + l1.contains(7));         //boolean return true or false
        System.out.println("L1 list contains 4 : " + l1.contains(4));

        ArrayList<Integer> l2 = new ArrayList<>();              //either we can leave inital capacity as empty or can give some value also and on substequent addition it shift it's capacity        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);


        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);                                              //will add at last 
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);
 
        l1.addAll(0,l2);        //You can add the elements of l2 at the starting of l1 by typing index as 0

        System.out.println("L1 Array list : "+ l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));
    }
}
*/


                                                //Q on ArrayList mixed with generics
/*
import java.util.*;
class Gen<T>{
    ArrayList<T> arr;
    
    Gen(ArrayList<T> arr){
        this.arr = arr;
    }
    
    public ArrayList<T> rev(){
        Collections.reverse(arr);
        return arr;
    }
}
public class ArrayL{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        ArrayList<Integer> arrM = new ArrayList<>();
        for(int i=0; i<n; i++){
            arrM.add(s.nextInt());
        }
        System.out.println(arrM);
        
        Gen<Integer> g = new Gen<>(arrM);
        //g.rev();
        //System.out.println(arrM);
        System.out.println(g.rev());
    }
}
*/

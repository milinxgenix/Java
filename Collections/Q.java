                                                //DeQueue
/* 
import java.util.*;
public class Q extends Thread{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
//Insertion at front :
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);
//Insertion At End:
        ad1.addLast(5);
        ad1.offerLast(10);
        System.out.println(ad1);
//Accessing an element from the head of the deque array:
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
//Accessing the last element: 
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
//Removing the first element:
        ad1.pollFirst(); 
        ad1.removeFirst(); 
        System.out.println(ad1);
//Removing the last element: 
        ad1.pollLast(); 
        ad1.removeLast(); 
        System.out.println(ad1);
    }
}
*/


                                        //Q on Priority Queue mixed with generic class
/* 
    class sort<T>{
    Queue<T> mon;
    int n;
    public sort(Queue<T> mon,int n){
        this.mon=mon;
        this.n=n;
    }
    public void get(){
        System.out.printf("[");
        for(int i=0;i<n;i++){
        System.out.printf("%.2f",mon.poll());
        if(i<n-1){
            System.out.printf(", ");
        }
        }
        System.out.printf("]");
    }
}
class Q{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Double> vars =new PriorityQueue<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            vars.offer(sc.nextDouble());
        }
        sort<Double> varsa=new sort<>(vars,n);
        varsa.get();
    }
}
*/
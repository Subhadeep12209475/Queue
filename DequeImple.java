import java.util.*;
public class DequeImple{
  public static void main(String args[]){
    Deque<Integer> dq= new LinkedList<>();
    dq.addFirst(1);
    dq.addFirst(2);
    dq.addFirst(3);
    dq.addFirst(4);
    dq.addLast(5);
    dq.addLast(6);
    dq.addLast(6);
    dq.addLast(7);
    dq.removeLast();
    System.out.println(dq);
    dq.removeFirst();
    System.out.println(dq);
    dq.remove();
    System.out.println(dq);


  }
}
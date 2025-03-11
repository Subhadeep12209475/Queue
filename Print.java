import java.util.*;
public class Print{
  public static void main(String args[]){
    Queue<Integer> q= new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    Queue<Integer> helper = new LinkedList<>();
    while(q.size() != 0){
      int top=q.peek();
      System.out.print(top+" ");
     helper.add(q.remove());
    }
  System.out.println();
    while(helper.size() != 0){
       int top=helper.peek();
      System.out.print(top+" ");
    q.add(helper.remove());
    }

  }
}
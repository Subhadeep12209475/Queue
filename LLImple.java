public class LLImple{
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=next;
    }
  }
  public static class QueueLL{
    Node head=null;
    Node tail=null;
    int size=0;
    public void add(int data){
      Node newnode = new Node(data);
      if(size==0){
        head=tail=newnode;
      }else{
        tail.next=newnode;
        tail=newnode;
      }
      size++;
    }
  public int remove(){
    if(size==0){
      System.out.println("There is no element exist");
      return -1;
    }else{
      int x= head.data;
      head=head.next;
      size--;
       return x;
    }
  }
  public int peek(){
    if(size==0){
      System.out.println("There is no element exist");
      return -1;
    }
    else{
      return head.data;
    }
  }
  public void display(){
    Node temp=head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
  public boolean isEmpty(){
    if(head==null){
      return true;
    }
    else return false;
  }
  }
  public static void main(String args[]){
    QueueLL q= new QueueLL();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    q.remove();
    q.display();
    System.out.println(q.peek());
    System.out.println(q.isEmpty());
  }
}
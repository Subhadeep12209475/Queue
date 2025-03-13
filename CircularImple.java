public class CircularImple{
  public static class Queue{
    int size=0;
    int ans[]= new int[10];
    private int f=-1;
    private int r=-1;

    public void add(int val){
      if(size==0){
        ans[0]=val;
        f=r=0;
      }
      else if(size==ans.length){
        System.out.println("Array is full");
      }
      else if(r<ans.length){
        ans[r+1]=val;
        r++;
      }
      else{
        ans[0]=val;
        r=0;
      }
      size++;
    }
    public int remove(){
      if(size==0){
        System.out.println("Array is empty");
        return -1;
      }
      else if(f==ans.length-1){
        int x= ans[f];
        f=0;
        size--;
        return x;
      }
      else{
        int x= ans[f];
        f++;
        size--;
        return x;
      }
    }
    public int peek(){
      if(size==0){
        System.out.println("Array is empty");
        return -1;
      }
      return ans[f];
    }
    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      else return false;
    }
    public void display(){
      for(int i=f;i<=r;i++){
        System.out.print(ans[i]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Queue q= new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.display();
    q.display();
    System.out.println(q.peek());
    System.out.println(q.isEmpty());
    q.add(4);
    q.add(4);
    q.add(4);
    q.add(4);
    q.add(4);
    q.add(4);
    // q.add(4);
    // q.add(4);
    q.display();
  }
}
public class ArrayImple{
  public static class Queue{
    private int f=-1,r=-1;
    int size=0;
    private int arr[]= new int[5];
    public void add(int val){
      if(f == -1){
        arr[0]=val;
        f++;
        r++;
      }else{
        arr[r+1]=val;
        r++;
      }
      size++;
    }
    public int remove(){
      if(size==0){
        System.out.println("No element");
        return -1;
      }
      int x= arr[f];
      f++;
      size--;
      return x;
    }

    public int size(){
      return size;
    }
    public int peek(){
      if(size==0){
        System.out.println("No element");
        return -1;
      }

      return arr[f];
    }

    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      else return false;
    }
    public void display(){
      if(size==0){
        System.out.print("No elements");
        return;
      }else{

        for(int i=f;i<=r;i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
    }
  }
  public static void main(String args[]){
    Queue q= new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    q.display();
    System.out.println(q.peek());
    q.remove();
  q.display();
  System.out.println(q.isEmpty());
}
}
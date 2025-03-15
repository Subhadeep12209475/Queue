public class DequeArray{
  public static class deque{
    private int f=-1;
    private int r=-1;
    private int arr[]= new int[5];
    int size=0;
    public void addFirst(int data){
      if(size==arr.length){
        System.out.println("Array is full");
      }
      if(f==-1){
        f=r=0;
        arr[0]=data;
      }else if(f==0){
        for(int i=r;i>=f;i--){
          arr[i+1]=arr[i];
        }
          r++;
          arr[f]=data;
      }else{
        f--;
        arr[f]=data;
      }
      size++;
    }
    public int removeFirst(){
      if(f==-1){
        System.out.println("Array in empty");
        return -1;
      }else{
        int x= arr[f];
        f++;
        size--;
        return x;
      }
    }
  public void addLast(int data){
    if(f==-1){
        f=r=0;
        arr[0]=data;
      }
      else{
        arr[++r]=data;
      }
  }
  public int removeLast(){
    if(f==-1){
        System.out.println("Array in empty");
        return -1;
      }
      else{
        int x = arr[r];
        r--;
        size--;
        return x;
      }
  }
  public int getFirst(){
    if(f==-1){
        System.out.println("Array in empty");
        return -1;
      }
      else return arr[f];
  }
  public int getLast(){
    if(f==-1){
        System.out.println("Array in empty");
        return -1;
      }
      else return arr[r];
  }
  public boolean isEmpty(){
    if(size==0){
      return true;
    }
    else return false;
  }
  public void display(){
    for(int i=f;i<=r;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  }
  public static void main(String args[]){
    deque q= new deque();
    q.addLast(1);
    q.addLast(2);
    q.addLast(3);
    q.addLast(4);
    q.addLast(5);
    q.addLast(6);
  }
}

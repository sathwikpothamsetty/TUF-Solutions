class ArrayQueue {
    int [] arr;
    int start,end;
    int currsize,maxsize;
    public ArrayQueue() {
        arr=new int[10];
        start=-1;
        end=-1;
        currsize=0;
        maxsize=10;
        
    }

    public void push(int x) {
        if(currsize==maxsize)
          System.out.println("Queue is full\nExiting...");

          if(end==-1)
          {
            start=0;
            end=0;
          }else
          {
            end=(end+1)%maxsize;
          }
            arr[end]=x;
        currsize++;
        
       
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped=arr[start];
         if(currsize==1)
         {
            start=-1;
            end=-1;
         }else{
            start=(start+1)%maxsize;
         }
       currsize--;
       return popped;
      
    }

    public int peek() {
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        return arr[start];
        
    }

    public boolean isEmpty() {
        return (currsize==0);
    }
}

class ArrayStack {
    int arr[];
    int top;
    public ArrayStack() {
        arr=new int[100];
        top=-1;
        
    }

    public void push(int x) {
        top++;
        arr[top]=x;
       
    }

    public int pop() {
        int value=arr[top];
        top--;
        return value;
      
    }

    public int top() {
        return arr[top];
        
    }

    public boolean isEmpty() {
        return top==-1;
    }
}

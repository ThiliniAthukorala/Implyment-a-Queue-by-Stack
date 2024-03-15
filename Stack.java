public class Stack {
    private StackNode top;


    public Stack( ) {
        this.top = null;

    }
    public boolean isEmpty(){
        if (this.top==null){
            return true;
        }else {
            return false;
        }
    }
    public void push(int data){
        StackNode stack=new StackNode(data);

        if (this.top==null){
            this.top=stack;
        }else {
            stack.setNext(this.top);
            this.top=stack;
        }
    }

    public int  pop(){
        StackNode temp=this.top;
        if (isEmpty()){
            System.out.println("empty stack");
        }else{
            this.top=this.top.getNext();
        }
        return temp.getData();
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("not any value");
        }else {
            System.out.println(this.top.getData());
        }
    }

    public void display(){
        StackNode temp=this.top;

        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

}

public class StackQueue {
    private Stack s1;
    private Stack  s2;

    public StackQueue() {
        this.s1 = new Stack();
        this.s2= new Stack();
    }

    public void enqueue(int data){
            s1.push(data);

    }

    public void dequeue(){
        while(!s1.isEmpty()){
            int temp=s1.pop();
            s2.push(temp);
        }
        s2.pop();
        while(!s2.isEmpty()){
            int temp=s2.pop();
            s1.push(temp);
        }



    }
    public void display(){
        while(!s1.isEmpty()){
            int temp=s1.pop();
            s2.push(temp);
        }
        s2.display();
        while(!s2.isEmpty()){
            int temp=s2.pop();
            s1.push(temp);
        }

    }

}

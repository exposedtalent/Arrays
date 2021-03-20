public class Rotate {

    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];

    Rotate(){
        top = -1;
    }

    boolean isEmpty(){
        if(top <= 0){
            System.out.println("The Stack is FULL");
            return true;
        }
        else{
            return false;
        }
    }

    boolean push(int num ){
        // when can we push a variabs if the stack is not full
        if(top == MAX -1){
            return false;
        }
        // what do we do if we can add an element
        else{
            arr[++top] = num;
            System.out.println(num + " is been pushed to the stack");
            return true;
        }
    }

    int pop(){
        // when can we pop if the stack has at least one element
        if(top < 0) {
            System.out.println("The stack is empty ");
            return -1;
        }
        else{
            int x  = arr[top--];
            return x;
        }
    }

    int peek(){
        // when can we peek. when the top is not empty
        if(top < 0){
            System.out.print("The Stack is empty ");
            return -1;
        }
        else{
            int x = arr[top];
            return x;
        }
    }


        public static void main(String agr[]) {
            Rotate r = new Rotate();
            r.push(5);
            r.push(6);
            r.peek();
            r.isEmpty();
            r.pop();
            r.peek();
        }

}

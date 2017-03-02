package in.orangecounty.sajin.sajin;

import java.util.Arrays;

/**
 * Created by sajin on 02/03/17.
 */
public class Stack {
    public static void main(String []args){
        java.util.Stack<Integer> javaStack = new java.util.Stack<>();
        MyStack stack=new MyStack(10);
        for(int x = 0; x < 10; x++){
            int value = new Double(Math.random()*100).intValue();
            javaStack.push(value);
            stack.push(value);
        }
        System.out.println(stack);
        System.out.println(javaStack);
        for(int x = 0; x < 11; x++){

            System.out.printf("Pop value of %d is %d\n", x, javaStack.pop());
            System.out.printf("Pop value of %d is %d\n", x, stack.pop());
        }
    }
}



class MyStack {
    int maxsize;
    int[] stackArray;
    int top;
    public MyStack(int s){
        maxsize =s;
        stackArray = new int[maxsize];
        top=-1;
    }
    void push(int x){
        stackArray[++top]=x;
    }
    int pop(){
        return stackArray[top--];
    }
    boolean isempty(){
        return(top==-1);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "maxsize=" + maxsize +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                '}';
    }
}

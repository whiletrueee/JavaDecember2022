package StackQueue;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) throws Exception {
        QueueUsingStack stack= new QueueUsingStack();
        stack.add(5);
        System.out.println(stack.remove());
    }

    static class QueueUsingStack{
        private final Stack<Integer> first;
        private final Stack<Integer> second;

        public QueueUsingStack(){
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item){
            first.push(item);
        }

        public int remove() throws Exception{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();

            while (!second.isEmpty()){
                first.push(second.pop());
            }

            return removed;
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }

        public int peek() throws Exception{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peek = second.peek();

            while (!second.isEmpty()){
                first.push(second.pop());
            }

            return peek;
        }
    }

    static class QueueUsingStackRemoveEfficient{
        private final Stack<Integer> first;
        private final Stack<Integer> second;

        public QueueUsingStackRemoveEfficient(){
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) throws Exception{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            first.push(item);
            while (!second.isEmpty()){
                first.push(second.pop());
            }
        }

        public int remove(){
            return first.pop();
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }

        public int peek(){
            return first.peek();
        }
    }
}

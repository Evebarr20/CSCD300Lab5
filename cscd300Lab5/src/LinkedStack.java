import java.util.EmptyStackException;
import java.util.*;
public class LinkedStack {
    private class Node {
        private Object data;
        private Node next;
        public Node(Object e, Node n) {
            this.data = e;
            this.next = n;
        }
    } // end of Node class
    private Node top; //head
    private int size;
    public  LinkedStack(){
        this.top = null;
        this.size = 0;
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if (top == null) return true;
        return false;
    }
    public void push(Object elem) {
        Node nn = new Node(elem, this.top);
        this.top = nn;
        this.size++;
    }
    public Object top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.data;
    }
    public Object pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        Object temp = top.data;
        this.top = top.next;
        this.size--;
        return temp;
    }
    public String toString() {
        String s;
        Node cur = null;
        s = "[";
        int n = size();
        if (n > 0) {
            cur = top;
            s += cur.data;
        }
        if (n > 1)
            for (int i = 1; i <= n-1; i++) {
                cur = cur.next;
                s += ", " + cur.data;
            }
        s += "]";
        return s;
    }



}
